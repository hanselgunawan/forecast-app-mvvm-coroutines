package com.hanseltritama.forecastappmvvm.data

data class CurrentWeatherResponse(
    val request: Request,
    val location: Location,
    val current: Current
)