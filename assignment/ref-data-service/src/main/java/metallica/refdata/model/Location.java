package metallica.refdata.model;

public class Location extends BaseModel {

	private String locationName;

	public Location(final String id, final String locationName) {
		super(id);
		this.locationName = locationName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	
}
