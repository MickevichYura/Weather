package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "sun")
public class Sun {

    @Attribute
    private String rise;

    @Attribute
    private String set;

    public String getRise() {
        return rise;
    }

    public String getSet() {
        return set;
    }

    @Override
    public String toString() {
        return " [rise = " + rise + ", set = " + set + "]";
    }
}
