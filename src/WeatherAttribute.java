/**
 * Created by codeamend on 9/13/15.
 */
abstract class WeatherAttribute implements WeatherData {

    protected int data;
    protected String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setData(int data) {
        this.data = data;
    }

    @Override
    public int getData() {
        return data;
    }

}
