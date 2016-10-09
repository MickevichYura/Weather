package mickevichyura.github.com.weather.utils;

import java.text.SimpleDateFormat;
import java.util.Locale;

public interface DateFormat {
    String PARSE_DATE_FORMAT_PATTERN = "yyyy-MM-dd'T'HH:mm:ss";
    String DATE_FROM_FORMAT_PATTERN = "EEE MMM dd\nHH:mm";
    String DATE_TO_FORMAT_PATTERN = "HH:mm";
    SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(PARSE_DATE_FORMAT_PATTERN, Locale.US);
    SimpleDateFormat DATE_FROM_FORMAT = new SimpleDateFormat(DATE_FROM_FORMAT_PATTERN, Locale.US);
    SimpleDateFormat DATE_TO_FORMAT = new SimpleDateFormat(DATE_TO_FORMAT_PATTERN, Locale.US);
}
