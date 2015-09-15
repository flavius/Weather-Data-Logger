/**
 * Created by codeamend on 9/15/15.
 */
public class Display implements LiveUpdateWatch {

    WeatherStation station;

    @Override
    public void attatchObserver(WeatherStation station) {
        this.station = station;
        printAllData();
    }

    @Override
    public void printAllData() {
        System.out.println(station.getStationName() + " was created...");
    }
}
