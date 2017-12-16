package uk.ac.qub.lab2;

/**
 * concrete product...a wireless door sensor
 * @author Stuart
 *
 */
public class WirelessDoorSensor implements IDoorSensor {

	public WirelessDoorSensor() {
		System.out.println("Wireless door sensor created....");
	}

	@Override
	public void detect() {
		System.out.println("Wireless door sensor detecting movement...");

	}

}
