package com.hanseltritama.forecastappmvvm.data
import com.google.gson.annotations.SerializedName

data class CurrentWeatherResponse(
    val request: Request,
    val location: Location,
    val current: Current
)