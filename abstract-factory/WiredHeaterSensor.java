package uk.ac.qub.lab2;

/**
 * class to represent a wired heater sensor
 * @author Stuart
 *
 */
public class WiredHeaterSensor implements IHeaterSensor {

	public WiredHeaterSensor() {
		System.out.println("Wired heater sensor created...");
	}

	@Override
	public void measure() {
		System.out.println("Wired heater sensor measuring temp....");

	}

}
