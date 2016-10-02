package mickevichyura.github.com.weather.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import mickevichyura.github.com.weather.R;
import mickevichyura.github.com.weather.model.TimeInterval;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherCardViewHolder> {

    private List<TimeInterval> mTimeInterval;

    public WeatherAdapter(List<TimeInterval> timeInterval) {
        this.mTimeInterval = timeInterval;
    }

    @Override
    public WeatherCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.weather_card, parent, false);
        WeatherCardViewHolder vh = new WeatherCardViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(WeatherCardViewHolder holder, int position) {
        holder.mTextView.setText(mTimeInterval.get(position).getTemperature().getValue());
        holder.mImageView.setImageResource(R.drawable.i10d);
    }

    @Override
    public int getItemCount() {
        return mTimeInterval.size();
    }
}
