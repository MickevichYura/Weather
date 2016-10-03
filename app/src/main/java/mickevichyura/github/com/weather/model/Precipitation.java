package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "precipitation")
public class Precipitation {
    @Attribute(name = "unit", required = false)
    private String unit;

    @Attribute(name = "value", required = false)
    private String value;

    @Attribute(name = "mode", required = false)
    private String mode;

    public String getUnit() {
        return unit;
    }

    public String getValue() {
        return value;
    }

    public String getMode() {
        return mode;
    }

    @Override
    public String toString() {
        return "[unit = " + unit + ", value = " + value + ", mode = " + mode + "]";
    }
}