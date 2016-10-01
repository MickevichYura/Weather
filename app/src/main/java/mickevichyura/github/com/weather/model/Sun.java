package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name="sun")
public class Sun {

    @Attribute
    private String rise;

    @Attribute
    private String set;

    public String getRise() {
        return rise;
    }

    public void setRise(String rise) {
        this.rise = rise;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return " [rise = " + rise + ", set = " + set + "]";
    }
}
