package com.hanseltritama.forecastappmvvm.data

import com.hanseltritama.forecastappmvvm.data.network.response.CurrentWeatherResponse
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "8e766debd660b4669926911c5169d86e"
const val BASE_URL = "http://api.weatherstack.com/"

// Current Weather
// https://api.weatherstack.com/current?access_key=8e766debd660b4669926911c5169d86e&query=Los%20Angeles

interface WeatherAPIService {

    @GET("current")
    fun getCurrentWeather(
        @Query("query") location: String
    ): Deferred<CurrentWeatherResponse>
    // Deferred is a part of Kotlin's coroutine
    // We can call `await` if we specify this as Deferred
    // So the code will be executed after the specified wait time

    companion object {
        operator fun invoke(): WeatherAPIService {
            val requestInterceptor = Interceptor { chain ->
                // This is used to intercepting request
                val url = chain.request()
                        .url()
                        .newBuilder()
                        .addQueryParameter("access_key", API_KEY)
                        .build()
                val request = chain.request()
                        .newBuilder()
                        .url(url)
                        .build()
                return@Interceptor chain.proceed(request)
            }
            val okHttpClient = OkHttpClient.Builder()
                    .addInterceptor(requestInterceptor)
                    .build()

            return Retrofit.Builder()
                    .client(okHttpClient)
                    .baseUrl(BASE_URL)
                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(WeatherAPIService::class.java)
        }
    }
}
