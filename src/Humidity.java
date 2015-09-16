/**
 * Created by codeamend on 9/15/15.
 */
public class Humidity extends WeatherAttribute {

    private String name = "Temperature";

    Humidity(int value) {
        super(value);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
