package uk.ac.qub.lab2;

/**
 * this is our abstractfactory which is referenced by the client at compile time
 * @author Stuart
 *
 */
public interface ISensorFactory {
	
	// every system has both a door sensor and a heater sensor, hence the two creation methods

	/**
	 * abstract method for creating a door sensor
	 * @return
	 */
	public IDoorSensor createDoorSensor();
	
	/**
	 * abstract method for creating a heater sensor
	 * @return
	 */
	public IHeaterSensor createHeaterSensor();
}
