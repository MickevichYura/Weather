package mickevichyura.github.com.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import mickevichyura.github.com.weather.adapter.ItemOffsetDecoration;
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
        mTimeIntervals = new ArrayList<>();

        mRecyclerView = (RecyclerView) findViewById(R.id.weather_recycler_view);
        mRecyclerView.setHasFixedSize(true);

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        mTextView.setText(String.valueOf(metrics.widthPixels));

        int spanCount = 4;
        if(metrics.widthPixels < 1440){
            spanCount = 3;
        }
        mLayoutManager = new GridLayoutManager(this, spanCount);
        mRecyclerView.setLayoutManager(mLayoutManager);
        ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(this, R.dimen.item_offset);
        mRecyclerView.addItemDecoration(itemDecoration);

        mAdapter = new WeatherAdapter(mTimeIntervals);
        mRecyclerView.setAdapter(mAdapter);

        if(savedInstanceState == null){
            getForecast();
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        for (int i = 0; i < mTimeIntervals.size(); i++) {
            outState.putSerializable("timeInterval" + i, mTimeIntervals.get(i));
        }
        outState.putInt("timeIntervalSize", mTimeIntervals.size());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        for (int i = 0; i < savedInstanceState.getInt("timeIntervalSize"); i++) {
            mTimeIntervals.add((TimeInterval) savedInstanceState.getSerializable("timeInterval" + i));
            mAdapter.notifyItemInserted(i);
        }
    }

    private void getForecast() {
        try {
            mWeatherService.getForecast(getString(R.string.city_id), getString(R.string.api_result_mode), getString(R.string.owp_key), new Callback() {

                @Override
                public void onResponse(Call call, Response response) {
                    WeatherData responseData = (WeatherData) response.body();
                    mTimeIntervals.addAll(responseData.getForecast().getTimeInterval());
                    mAdapter.notifyItemRangeInserted(0, mTimeIntervals.size());
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
