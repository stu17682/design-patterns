package uk.ac.qub.lab2;

/**
 * this class controls the system
 * 
 * @author Stuart
 *
 */
public class SensorController {

	// has to hold a reference each type of sensor
	private IDoorSensor doorSensor;
	private IHeaterSensor heaterSensor;

	// and a ref for the factory (?)
	private ISensorFactory factory;

	// has to take a factory as an arg in the constructor
	public SensorController(ISensorFactory factory) {

		// call createDoorSensor(), assign object returned to doorSensor
		this.doorSensor = factory.createDoorSensor();
		// call createHeaterSensor(), assign object returned to heaterSensor
		this.heaterSensor = factory.createHeaterSensor();

	}

	/**
	 * method to run relevant methods for door and heater sensor
	 */
	public void start() {
		doorSensor.detect();
		heaterSensor.measure();
	}

}
