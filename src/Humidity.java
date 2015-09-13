/**
 * Created by codeamend on 9/13/15.
 */
public class Humidity implements WeatherData {

    private int data = 0;
    private String name;

    Humidity() {
        this.name = "Humidity";
        this.data = 0;
    }

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
