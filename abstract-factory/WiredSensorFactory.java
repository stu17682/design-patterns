package uk.ac.qub.lab2;

/**
 * concrete factory to make wired sensors
 * @author Stuart
 *
 */
public class WiredSensorFactory implements ISensorFactory {

	public WiredSensorFactory() {
		System.out.println("WIRED Sensor Factory created");
		System.out.println("=====================");
	}

	@Override
	public IDoorSensor createDoorSensor() {
		
		return new WiredDoorSensor();
	}

	@Override
	public IHeaterSensor createHeaterSensor() {
		
		return new WiredHeaterSensor();
	}

}
