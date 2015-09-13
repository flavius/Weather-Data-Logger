/**
 * Created by codeamend on 9/13/15.
 */
public class Temperature implements WeatherData {

    private int data;
    private String name;

    Temperature() {
        this.name = "Temperature";
        this.data = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getData() {

        return this.data;
    }

    @Override
    public void setData(int data) {

        this.data = data;
    }
}
