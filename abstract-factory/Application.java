package uk.ac.qub.lab2;

public class Application {

	// main runner

	public static void main(String[] args) {
		
		// create sensorcontroller
		SensorController sc;
		// create isensorfactory, set as null
		ISensorFactory factory = null;
		
//		int choice = 1;
//
//		try {
//			choice = Integer.parseInt(args[0]);
//		} catch (NumberFormatException e) {
//			System.err.println("Argument must be an integer");
//			System.exit(1);
//		}
//
//		// non singleton version
//		if (choice == 1) {
//			factory = new WiredSensorFactory();
//		} else {
//			factory = new WirelessSensorFactory();
//		}

		// factories should be one of a kind, we do not need or want more than one object creating sensors, so use the singleton patttern
		
		// singleton version
		factory = WirelessSensorFactory.getInstance();

		// then pass factory into sensorcontroller
		sc = new SensorController(factory);
		
		// and call start
		sc.start();

	}

}
