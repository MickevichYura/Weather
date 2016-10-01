package mickevichyura.github.com.weather.utils;

import mickevichyura.github.com.weather.model.ResponseData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    String BASE_URL = "http://api.openweathermap.org";

    @GET("/data/2.5/weather")
    Call<ResponseData> getWeather(@Query("q") String city, @Query("mode") String mode, @Query("appid") String key);
}
