package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "current", strict = false)
public class ResponseData {
    @Element(name = "clouds")
    private Clouds clouds;

    @Element(name = "wind")
    private Wind wind;

    private Lastupdate lastupdate;

    @Element(name = "humidity")
    private Humidity humidity;

    @Element(name = "pressure")
    private Pressure pressure;

    @Element(name = "visibility", required = false)
    private String visibility;

    @Element(name = "precipitation")
    private Precipitation precipitation;

    @Element(name = "weather")
    private Weather weather;

    @Element(name = "city")
    private City city;

    @Element(name = "temperature")
    private Temperature temperature;

    public Clouds getClouds() {
        return clouds;
    }

    public Wind getWind() {
        return wind;
    }

    public Lastupdate getLastupdate() {
        return lastupdate;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public String getVisibility() {
        return visibility;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public Weather getWeather() {
        return weather;
    }

    public City getCity() {
        return city;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return " [clouds = " + clouds + ", wind = " + wind + ", lastupdate = " + lastupdate + ", humidity = " + humidity + ", pressure = " + pressure + ", visibility = " + visibility + ", precipitation = " + precipitation + ", weather = " + weather + ", city = " + city + ", temperature = " + temperature + "]";
    }
}
