package com.hanseltritama.forecastappmvvm.data

import retrofit2.http.GET
import retrofit2.http.Query

const val API_KEY = "8e766debd660b4669926911c5169d86e"

// Current Weather
// http://api.weatherstack.com/current?access_key=8e766debd660b4669926911c5169d86e&query=Los%20Angeles

interface WeatherAPIService {

    @GET("current")
    fun getCurrentWeather(
        @Query("query") location: String
    )
}