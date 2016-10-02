package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name="clouds", strict = false)
public class Clouds
{
    @Attribute(name = "all", required = false)
    private String name;

    @Attribute
    private String value;

    public String getName ()
    {
        return name;
    }

    public String getValue ()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return "[name = "+name+", value = "+value+"]";
    }
}

