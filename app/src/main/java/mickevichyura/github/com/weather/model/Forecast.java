package mickevichyura.github.com.weather.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name = "forecast", strict = false)
public class Forecast {

    @ElementList(inline = true, name = "time")
    private List<TimeInterval> mTimeInterval;

    public List<TimeInterval> getTimeInterval() {
        return mTimeInterval;
    }
}
