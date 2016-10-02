package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "time", strict = false)
public class TimeInterval {

    @Attribute
    private String from;

    @Attribute
    private String to;

    @Element
    private Pressure pressure;

    @Element(name = "temperature")
    private Temperature temperature;

    public String getFrom ()
    {
        return from;
    }

    public String getTo ()
    {
        return to;
    }

    public Pressure getPressure ()
    {
        return pressure;
    }

    public Temperature getTemperature() {
        return temperature;
    }

}