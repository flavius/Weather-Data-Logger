/**
 * Created by codeamend on 9/13/15.
 */
public class Pressure implements WeatherData {

    private int data;

    @Override
    public int getData() {
        return data;
    }

    @Override
    public void setData(int data) {
        this.data = data;
    }

}
