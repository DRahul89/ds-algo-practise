package metallica.refdata.model;

/**
 * 
 * A super class for all models
 *
 */
public class BaseModel {

	private Object entityId;

	public BaseModel(final Object entityId) {
		this.entityId = entityId;
	}

	public Object getEntityId() {
		return entityId;
	}

	public void setEntityId(Object entityId) {
		this.entityId = entityId;
	}

}
