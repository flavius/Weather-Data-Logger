/**
 * Created by codeamend on 9/13/15.
 */
public class Humidity implements WeatherAttribute {

    private int data = 0;

    @Override
    public int getData() {
        return data;
    }

    @Override
    public void setData(int data) {
        this.data = data;
    }

}
