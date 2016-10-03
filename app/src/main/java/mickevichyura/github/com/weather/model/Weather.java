package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "weather")
public class Weather {
    @Attribute
    private String icon;

    @Attribute
    private String value;

    @Attribute
    private String number;

    public String getIcon() {
        return icon;
    }

    public String getValue() {
        return value;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return " [icon = " + icon + ", value = " + value + ", number = " + number + "]";
    }
}

