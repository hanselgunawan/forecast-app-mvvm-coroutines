package com.hanseltritama.forecastappmvvm.data.network

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.hanseltritama.forecastappmvvm.data.network.response.CurrentWeatherResponse
import com.hanseltritama.forecastappmvvm.internal.NoConnectivityException

class WeatherNetworkDataSourceImpl(
    private val weatherAPIService: WeatherAPIService
) : WeatherNetworkDataSource {
    private val _downloadedCurrentWeather = MutableLiveData<CurrentWeatherResponse>()
    override val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
        get() = _downloadedCurrentWeather

    override suspend fun fetchCurrentWeather(location: String) {
        try {
            val fetchedCurrentWeather = weatherAPIService
                    .getCurrentWeather(location)
                    .await()
            _downloadedCurrentWeather.postValue(fetchedCurrentWeather)
        } catch (e: NoConnectivityException) {
            Log.e("Connectivity", "No Internet Connection", e)
        }
    }
}