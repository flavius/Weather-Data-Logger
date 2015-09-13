
/**
 * 
 * 	Defines a one-to-many dependency -> if one object changes state all of its dependents are notified automatically
 *  
 *  The observers rely/depend on the subjects
 *  
 *  	Why is it good? LOOSE COUPLING !!!
 *  
 *  		-> when two objects are loosely coupled, they can interact but they have little knowledge of
 *  			each other 
 *  		-> the only thing the subject knows about an observer is that it implements a
 *  				certain interface
 * 			-> we can add observers whenever we want: just have to implement the Observer interface
 * 			-> we do not have to modify the subject to add new type of observers
 * 			-> we can independently reuse subjects or observers
 * 			-> we can change the subject or observer independently
 * 
 * 		SO loosely coupled design is very good: we can build flexible systems that can handle change
 * 			because the interdependency between objects are minimal 
 * 
 * Very important principle in design -> USE LOOSELY COUPLED DESIGNS BETWEEN OBJECTS THAT INTERACTS
 * 
 */

public class App {

	public static void main(String[] args) {

		Humidity h = new Humidity();
		Temperature t = new Temperature();
		Pressure p = new Pressure();

		System.out.println(h.getData());
		System.out.println(p.getData());
		System.out.println(t.getData());

		h.setData(123);
		p.setData(456);
		t.setData(789);

		System.out.println(h.getData());
		System.out.println(p.getData());
		System.out.println(t.getData());

	}
}

/*
	public static void main(String[] args) {

		WeatherStation station = new WeatherStation();
		WeatherObserver weatherObserver = new WeatherObserver(station);

		station.setHumidity(100);
		station.setPressure(200);
		station.setTemperature(300);
		station.setTemperature(800);
	}*/
