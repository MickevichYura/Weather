package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "temperature", strict = false)
public class Temperature implements Serializable {

    @Attribute
    private String unit;

    @Attribute
    private float value;

    public String getUnit() {
        return unit;
    }

    public int getValue() {
        return Math.round(value);
    }

    @Override
    public String toString() {
        return "unit = " + unit + ", value = " + value + "]";
    }
}
