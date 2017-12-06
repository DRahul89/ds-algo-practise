package metallica.refdata.model;

public class Commodity extends BaseModel {

	private String commodityName;

	public Commodity(final String id, final String commodityName) {
		super(id);
		this.commodityName = commodityName;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	
	

}
