package com.hanseltritama.forecastappmvvm.data.network

import androidx.lifecycle.LiveData
import com.hanseltritama.forecastappmvvm.data.network.response.CurrentWeatherResponse

interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String
    )
}