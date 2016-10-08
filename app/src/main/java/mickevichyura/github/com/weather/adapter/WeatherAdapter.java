package mickevichyura.github.com.weather.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import mickevichyura.github.com.weather.R;
import mickevichyura.github.com.weather.model.TimeInterval;

import static mickevichyura.github.com.weather.utils.WeatherApi.BASE_URL;

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

        holder.mTextView.setText(String.format(holder.mImageView.getContext().getString(R.string.degree),
                mTimeInterval.get(position).getTemperature().getValue()));
        holder.mTextViewCloudsValue.setText(mTimeInterval.get(position).getHumidity().toString());
        String url = BASE_URL + "/img/w/" + mTimeInterval.get(position).getSymbol().getVar() + ".png";
        Picasso.with(holder.mImageView.getContext())
                .load(url)
                .noPlaceholder()
                .error(R.drawable.i10d)
                .resize(50, 50)
                .into(holder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mTimeInterval.size();
    }
}
