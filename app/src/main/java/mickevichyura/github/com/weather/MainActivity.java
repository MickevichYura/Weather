package mickevichyura.github.com.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import mickevichyura.github.com.weather.model.ResponseData;
import mickevichyura.github.com.weather.service.WeatherService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private WeatherService mWeatherService;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.buttonGetWeather);
        mTextView = (TextView) findViewById(R.id.textWeather);
        mWeatherService = new WeatherService();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    mWeatherService.getWeather("London,uk", "xml", getString(R.string.owp_key), new Callback() {

                        @Override
                        public void onResponse(Call call, Response response) {
                            ResponseData responseData = (ResponseData) response.body();
                            mTextView.setText(responseData.getCity().getName());
                        }

                        @Override
                        public void onFailure(Call call, Throwable t) {
                            t.getCause();
                            t.getMessage();
                            t.getStackTrace();
                            Log.d("WeatherService", t.getCause().toString());
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }

}
