/**
 * Created by codeamend on 9/15/15.
 */
abstract class WeatherAttribute {

    protected int value;

    // How can a MAKE a child class create this constructor?
    WeatherAttribute(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
