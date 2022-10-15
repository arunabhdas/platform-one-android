package ai.cloudcnctr.weather.data.remote

import com.squareup.moshi.Json

/**
 * Created by Das on 2022-10-15.
 */
data class WeatherHourlyDto(
    @Json(name = "pressure_msl")
    val pressure_msl: List<Any>,
    @Json(name = "relativehumidity_2m")
    val relativehumidity_2m: List<Any>,
    @Json(name = "temperature_2m")
    val temperature_2m: List<Any>,
    @Json(name = "time")
    val time: List<Any>,
    @Json(name = "weathercode")
    val weathercode: List<Any>,
    @Json(name = "windspeed_10m")
    val windspeed_10m: List<Any>
)