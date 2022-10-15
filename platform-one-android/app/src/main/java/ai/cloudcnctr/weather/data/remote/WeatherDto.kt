package ai.cloudcnctr.weather.data.remote

import com.squareup.moshi.Json
/**
 * Created by Das on 2022-10-15.
 */
data class WeatherDto (
    @Json(name = "hourly")
    val weatherHourlyData: WeatherHourlyDto
)