package uk.ac.qub.lab2;

/**
 * concrete class for a Wireless Heater Sensor
 * @author Stuart
 *
 */
public class WirelssHeaterSensor implements IHeaterSensor {

	public WirelssHeaterSensor() {
		System.out.println("Wireless heater sensor made....");
	}

	@Override
	public void measure() {
		System.out.println("Wirelss heater sensor measuring temp...");

	}

}
