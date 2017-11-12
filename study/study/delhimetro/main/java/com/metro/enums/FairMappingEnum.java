package main.java.com.metro.enums;

public enum FairMappingEnum {

	WeekDay(7), Weekend(5.5);

	private double fair;

	public double getFair() {
		return fair;
	}

	public void setFair(double fair) {
		this.fair = fair;
	}

	private FairMappingEnum(double fair) {
		this.fair = fair;
	}

}
