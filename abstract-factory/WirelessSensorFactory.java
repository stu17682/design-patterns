package uk.ac.qub.lab2;

/**
 * class to represent another concrete factory, this time for wireless sensors
 * 
 * @author Stuart
 *
 */
public class WirelessSensorFactory implements ISensorFactory {

	// public WirelessSensorFactory() {
	// System.out.println("WIRELESS Sensor Factory created");
	// System.out.println("=====================");
	// }

	// done as singleton

	// private static var referencing itself
	private static WirelessSensorFactory wSF;

	// private constructor
	private WirelessSensorFactory() {
		System.out.println("WIRELESS Sensor Factory created");
		System.out.println("=====================");
	}

	// public getter method to return static instance var
	public static WirelessSensorFactory getInstance() {

		// if wSF is null
		if (wSF == null) {
			// create a new wSF
			wSF = new WirelessSensorFactory();
			// and return it
			return wSF;

		} else {
			// otherwise return the existing wSF object
			return wSF;
		}
	}

	@Override
	public IDoorSensor createDoorSensor() {

		return new WirelessDoorSensor();
	}

	@Override
	public IHeaterSensor createHeaterSensor() {

		return new WirelssHeaterSensor();
	}

}
