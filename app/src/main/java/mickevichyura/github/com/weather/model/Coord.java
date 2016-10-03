package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;

public class Coord {
    @Attribute()
    private String lon;

    @Attribute(required = true)
    private String lat;

    public String getLon() {
        return lon;
    }

    public String getLat() {
        return lat;
    }

    @Override
    public String toString() {
        return " [lon = " + lon + ", lat = " + lat + "]";
    }
}
