package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "time", strict = false)
public class TimeInterval implements Serializable {

    @Attribute(name = "from")
    private String from;

    @Attribute(name = "to")
    private String to;

    @Element
    private Pressure pressure;

    @Element(name = "temperature")
    private Temperature temperature;

    @Element(name = "symbol")
    private Symbol symbol;

    @Element(name = "clouds")
    private Clouds clouds;

    @Element(name = "humidity")
    private Humidity humidity;

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Pressure getPressure() {
        return pressure;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return from;
    }
}
