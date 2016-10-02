package mickevichyura.github.com.weather.utils;

import mickevichyura.github.com.weather.model.ResponseData;
import mickevichyura.github.com.weather.model.WeatherData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    String BASE_URL = "http://api.openweathermap.org";

    @GET("/data/2.5/weather")
    Call<ResponseData> getWeather(@Query("id") String city, @Query("mode") String mode, @Query("appid") String key);

    @GET("/data/2.5/forecast")
    Call<WeatherData> getForecast(@Query("id") String city, @Query("mode") String mode, @Query("appid") String key);
}
