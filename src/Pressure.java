/**
 * Created by codeamend on 9/15/15.
 */
public class Pressure extends WeatherAttribute {

    Pressure(int value) {
        super(value);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
