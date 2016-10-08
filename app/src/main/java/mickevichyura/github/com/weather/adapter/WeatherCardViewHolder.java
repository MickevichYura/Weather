package mickevichyura.github.com.weather.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import mickevichyura.github.com.weather.R;

public class WeatherCardViewHolder extends RecyclerView.ViewHolder {

    public TextView mTextView;
    public TextView mTextViewCloudsValue;
    public ImageView mImageView;

    public WeatherCardViewHolder(View v) {
        super(v);
        mTextView = (TextView) v.findViewById(R.id.temperature);
        mTextViewCloudsValue = (TextView) v.findViewById(R.id.cloud_value);
        mImageView = (ImageView) v.findViewById(R.id.cloud_icon);
    }
}
