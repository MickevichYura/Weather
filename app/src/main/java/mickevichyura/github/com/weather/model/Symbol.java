package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "symbol", strict = false)
public class Symbol {

    @Attribute(name = "var", required = false)
    private String var;

    @Attribute(name = "name", required = false)
    private String name;

    @Attribute(name = "number", required = false)
    private String number;

    public String getVar() {
        return var;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[var = " + var + ", name = " + name + ", number = " + number + "]";
    }
}
