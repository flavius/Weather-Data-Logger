import java.util.ArrayList;
import java.util.List;

/**
 * Created by codeamend on 9/15/15.
 */
public class WeatherStation {

    private String name;
    private List<WeatherAttribute> attributeList = new ArrayList<>();

    WeatherStation(String name) {
        this.name = name;
    }

    //Fix-this note: find a way so it does not add multiple attributes with the same name.
    void updateData(WeatherAttribute attribute) {
        this.attributeList.add(attribute);
    }

}
