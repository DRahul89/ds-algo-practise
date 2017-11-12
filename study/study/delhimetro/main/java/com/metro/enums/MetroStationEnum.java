package main.java.com.metro.enums;

public enum MetroStationEnum {

	A1(1), A2(2), A3(3), A4(4), A5(5);

	private int stationPosition;

	private MetroStationEnum(int stationPos) {
		this.stationPosition = stationPos;
	}

	public int getStationPosition() {
		return stationPosition;
	}

	public void setStationPosition(int stationPosition) {
		this.stationPosition = stationPosition;
	}

	public int calculateDistance(MetroStationEnum second) {
		int firstStationLoc = this.getStationPosition();
		int secondStationLoc = second.getStationPosition();
		return Math.abs(firstStationLoc - secondStationLoc);
	}
}
