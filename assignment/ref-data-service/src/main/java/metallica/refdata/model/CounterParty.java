package metallica.refdata.model;

/**
 * 
 * counter party modal
 *
 */
public class CounterParty extends BaseModel {

	private String counterPartyName;
	
	


	public CounterParty(final Long id, final String counterPartyName) {
		super(id);
		this.counterPartyName = counterPartyName;
	}


	public String getCounterPartyName() {
		return counterPartyName;
	}

	public void setCounterPartyName(String counterPartyName) {
		this.counterPartyName = counterPartyName;
	}
	
	

}
