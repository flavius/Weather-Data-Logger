/**
 * Created by codeamend on 9/15/15.
 */
public class Temperature extends WeatherAttribute {

    private String name = "Temperature";

    Temperature(int value) {
        super(value);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
