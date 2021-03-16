package com.hanseltritama.forecastappmvvm.data.network.response

import com.hanseltritama.forecastappmvvm.data.db.entity.Current
import com.hanseltritama.forecastappmvvm.data.db.entity.Location
import com.hanseltritama.forecastappmvvm.data.db.entity.Request

data class CurrentWeatherResponse(
        val request: Request,
        val location: Location,
        val current: Current
)