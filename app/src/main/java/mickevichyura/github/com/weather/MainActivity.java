package mickevichyura.github.com.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import mickevichyura.github.com.weather.adapter.WeatherAdapter;
import mickevichyura.github.com.weather.model.TimeInterval;
import mickevichyura.github.com.weather.model.WeatherData;
import mickevichyura.github.com.weather.service.WeatherService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private WeatherService mWeatherService;
    List<TimeInterval> mTimeIntervals;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textWeather);
        mWeatherService = new WeatherService();

        mRecyclerView = (RecyclerView) findViewById(R.id.weather_recycler_view);

        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this, 5);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mTimeIntervals = new ArrayList<>();

        mAdapter = new WeatherAdapter(mTimeIntervals);
        mRecyclerView.setAdapter(mAdapter);
        getForecast();
    }

    private void getForecast() {
        try {
            mWeatherService.getForecast(getString(R.string.city_id), getString(R.string.api_result_mode), getString(R.string.owp_key), new Callback() {

                @Override
                public void onResponse(Call call, Response response) {
                    WeatherData responseData = (WeatherData) response.body();
                    String text = responseData.getForecast().getTimeInterval().get(0).getFrom() +
                            " " + responseData.getForecast().getTimeInterval().get(0).getTo();
                    mTextView.setText(text);
                    mTimeIntervals.addAll(responseData.getForecast().getTimeInterval());
                    mAdapter.notifyItemRangeChanged(0, mTimeIntervals.size());
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

}
