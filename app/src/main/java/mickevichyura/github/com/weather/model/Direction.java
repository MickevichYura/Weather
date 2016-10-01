package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name="direction")
public class Direction {
    @Attribute
    private String name;

    @Attribute
    private String value;

    @Attribute
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "[name = " + name + ", value = " + value + ", code = " + code + "]";
    }
}
