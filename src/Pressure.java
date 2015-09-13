/**
 * Created by codeamend on 9/13/15.
 */
public class Pressure implements WeatherData {

    private int data;
    private String name;

    Pressure() {
        this.name = "Pressure";
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
