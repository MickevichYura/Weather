package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;

import java.io.Serializable;

public class Pressure implements Serializable {
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
        return " [unit = " + unit + ", value = " + value + "]";
    }
}
