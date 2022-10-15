package ai.cloudcnctr.weather.data.remote

import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Das on 2022-10-15.
 */
interface WeatherApi {

    @GET("")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    )
}