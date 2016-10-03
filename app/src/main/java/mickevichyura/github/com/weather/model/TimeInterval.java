package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "time", strict = false)
public class TimeInterval implements Serializable {

    @Attribute
    private String from;

    @Attribute
    private String to;

    @Element
    private Pressure pressure;

    @Element(name = "temperature")
    private Temperature temperature;

    @Element(name = "symbol")
    private Symbol symbol;

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

}
