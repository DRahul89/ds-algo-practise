package main.java.mathematical;

/**
 * Hour and minute angle
 */
public class AngleBetweenHourAndMinute {

	public static int calcAngle(double h, double m) {
		// validate the input
		if (h < 0 || m < 0 || h > 12 || m > 60)
			System.out.println("Wrong input");

		if (h == 12)
			h = 0;
		if (m == 60) {
			m = 0;
			h = h + 1;
		}

		// Calculate the angles moved by hour and minute hands
		// with reference to 12:00
		int hour_angle = (int) (0.5 * (h * 60 + m));
		int minute_angle = (int) (6 * m);

		// Find the difference between two angles
		int angle = Math.abs(hour_angle - minute_angle);

		// Return the smaller angle of two possible angles
		angle = Math.min(360 - angle, angle);

		return angle;
	}

	public static void main(String[] args) {
		System.out.println(calcAngle(9, 60));
	}
}
