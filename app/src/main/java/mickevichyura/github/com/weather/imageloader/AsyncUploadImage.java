package mickevichyura.github.com.weather.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AsyncUploadImage extends AsyncTask<String, Integer, Bitmap> {

    private ImageView mImageView;
    private HttpURLConnection mConnection;
    private InputStream mInputStream;
    private Bitmap mBitmap;

    public AsyncUploadImage(ImageView mImageView) {
        this.mImageView = mImageView;
    }

    @Override
    protected Bitmap doInBackground(String... params) {
        URL url;
        try {
            url = new URL(params[0]);
            mConnection = (HttpURLConnection) url.openConnection();
            mConnection.setDoInput(true);
            mConnection.connect();
            mInputStream = mConnection.getInputStream();
            mBitmap = BitmapFactory.decodeStream(mInputStream);
            mInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (mInputStream != null) {
                    mInputStream.close();
                }
                if (mConnection != null) {
                    mConnection.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return mBitmap;
    }

    @Override
    protected void onPostExecute(Bitmap result) {
        super.onPostExecute(result);
        if (null != result) {
            mImageView.setImageBitmap(result);
        }
    }
}
