package codeamend;

/**
 * Created by codeamend on 9/14/15.
 */
public static class WeatherStation {

    WeatherAttribute humidity = new Humidity();
    WeatherAttribute temperature = new Temperature();
    WeatherAttribute pressure = new Pressure();


    WeatherStation() {
        setInitialValues();
    }

    private void setInitialValues() {
        this.humidity.setData(0);
        this.temperature.setData(0);
        this.pressure.setData(0);
    }


}