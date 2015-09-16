/**
 * Created by codeamend on 9/15/15.
 */
abstract class WeatherAttribute {

    protected int value;
    protected String name = "A certain weather attribute ";

    WeatherAttribute(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
