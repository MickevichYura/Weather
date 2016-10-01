package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name="precipitation")
public class Precipitation
{
    @Attribute
    private String unit;

    @Attribute
    private String value;

    @Attribute
    private String mode;

    public String getUnit ()
    {
        return unit;
    }

    public String getValue ()
    {
        return value;
    }

    public String getMode ()
    {
        return mode;
    }

    @Override
    public String toString()
    {
        return "[unit = "+unit+", value = "+value+", mode = "+mode+"]";
    }
}