package mickevichyura.github.com.weather.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.io.IOException;

import mickevichyura.github.com.weather.utils.WeatherApi;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class WeatherService extends Service {
    private WeatherApi service;

    public WeatherService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(WeatherApi.BASE_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        service = retrofit.create(WeatherApi.class);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new Binder();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        //getWeather();
        return super.onStartCommand(intent, flags, startId);
    }

    public void getWeather(String name, String mode, String apiKey, Callback callback) throws IOException {
        service.getWeather(name, mode, apiKey).enqueue(callback);
    }

    public void getForecast(String name, String mode, String apiKey, Callback callback) throws IOException {
        service.getForecast(name, mode, apiKey).enqueue(callback);
    }
}
