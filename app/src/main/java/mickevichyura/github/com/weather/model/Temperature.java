package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

import java.io.Serializable;

@Root(name = "temperature")
public class Temperature implements Serializable {
    @Attribute
    private String min;

    @Attribute
    private String unit;

    @Attribute
    private String max;

    @Attribute
    private String value;

    public String getMin() {
        return min;
    }

    public String getUnit() {
        return unit;
    }

    public String getMax() {
        return max;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return " [min = " + min + ", unit = " + unit + ", max = " + max + ", value = " + value + "]";
    }
}
