public class WeatherStation {

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


//public class WeatherStation {
//
//
//    private int pressure;
//    private int temperature;
//    private int humidity;
//    private List<Observer> observersList;
//
//    public WeatherStation() {
//
//        this.observersList = new ArrayList<>();
//    }
//
//    @Override
//    public void addObserver(Observer o) {
//        this.observersList.add(o);
//    }
//
//    @Override
//    public void removeObserver(Observer o) {
//        this.observersList.remove(observersList.indexOf(o));
//    }
//
//    @Override
//    public void notifyAllObservers() {
//        for (Observer observer : this.observersList) {
//            observer.update(pressure, temperature, humidity);
//        }
//    }
//
//    public void setPressure(int pressure) {
//        this.pressure = pressure;
//        notifyAllObservers();
//    }
//
//    public void setTemperature(int temperature) {
//        this.temperature = temperature;
//        notifyAllObservers();
//    }
//
//    public void setHumidity(int humidity) {
//        this.humidity = humidity;
//        notifyAllObservers();
//    }
//}