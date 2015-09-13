/**
 * Created by codeamend on 9/13/15.
 */
public class Temperature implements WeatherAttribute {

    private int data;

    @Override
    public int getData() {
        return this.data;
    }

    @Override
    public void setData(int data) {
        this.data = data;
    }
}
