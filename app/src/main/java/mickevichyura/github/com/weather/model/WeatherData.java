package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "weatherdata", strict = false)
public class WeatherData {

    @Element(name = "sun")
    private Sun sun;

    @Element
    private Forecast forecast;

    public Sun getSun() {
        return sun;
    }

    public Forecast getForecast() {
        return forecast;
    }
}
