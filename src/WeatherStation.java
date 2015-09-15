import java.util.ArrayList;
import java.util.List;

/**
 * Created by codeamend on 9/15/15.
 */
public class WeatherStation {

    private String name;
    private WeatherAttribute attribute;
    private List<WeatherAttribute> weatherAttributeList = new ArrayList();

    WeatherStation(String name) {
        this.name = name;
    }

    public void updateData(WeatherAttribute attribute) {
        this.attribute = attribute;
        weatherAttributeList.add(attribute);
    }

    public String getAttributeName() {
        return weatherAttributeList.get(0).name;
    }




}
