package uk.ac.qub.lab2;

/**
 * class to represent a wired door sensor
 * @author Stuart
 *
 */
public class WiredDoorSensor implements IDoorSensor {

	public WiredDoorSensor() {
		System.out.println("Wired door sensor created...");
	}

	@Override
	public void detect() {
		System.out.println("Wired door sensor detecting movement...");

	}

}
