/**
 * Created by codeamend on 9/15/15.
 */
public class App {

    public static void main(String[] args) {

        WeatherStation station_1 = new WeatherStation("Indiana");
        WeatherStation station_2 = new WeatherStation("Florida");
        WeatherStation station_3 = new WeatherStation("Idaho");

        Display display = new Display();

        display.attatchObserver(station_1);
        display.attatchObserver(station_2);
//
//        station_1.updateData(new Temperature(67));
//        station_2.updateData(new Humidity(55));
//        station_3.updateData(new Pressure(42));

        //This should display 2 different lines on the console
        //each station on a different line with data displayed.
        //station_3 / Idahos update will not be displayed

    }

}
