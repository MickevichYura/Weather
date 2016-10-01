package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="wind", strict = false)
public class Wind
{
    @Element(name = "speed")
    private Speed speed;

    @Element(name = "direction")
    private Direction direction;

    @Element(name = "gusts", required = false)
    private String gusts;

    public Speed getSpeed ()
    {
        return speed;
    }

    public Direction getDirection ()
    {
        return direction;
    }

    public String getGusts ()
    {
        return gusts;
    }

    @Override
    public String toString()
    {
        return " [speed = "+speed+", direction = "+direction+", gusts = "+gusts+"]";
    }
}
