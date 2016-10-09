package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "humidity")
public class Humidity implements Serializable {

    @Attribute
    private String unit;

    @Attribute
    private String value;

    public String getUnit() {
        return unit;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + unit;
    }
}
