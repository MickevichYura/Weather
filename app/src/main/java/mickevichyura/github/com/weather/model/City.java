package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "city")
public class City {
    @Attribute(required = false)
    private Integer id;

    @Element(name = "coord")
    private Coord coord;

    @Attribute(required = false)
    private String name;

    @Element(name = "sun")
    private Sun sun;

    @Element(name = "country")
    private String country;

    public Integer getId() {
        return id;
    }

    public Coord getCoord() {
        return coord;
    }

    public String getName() {
        return name;
    }

    public Sun getSun() {
        return sun;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "[id = " + id + ", coord = " + coord + ", name = " + name + ", sun = " + sun + ", country = " + country + "]";
    }
}
