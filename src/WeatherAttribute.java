/**
 * Created by codeamend on 9/15/15.
 */
abstract class WeatherAttribute {

    protected int value;

    protected WeatherAttribute(int value) {
        this.value = value;
    }

    public void updateDate(int value) {
        this.value = value;
    }


}
