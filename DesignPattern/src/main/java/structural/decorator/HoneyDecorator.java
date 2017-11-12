package src.main.java.structural.decorator;

/**
 * 
 * This class will be used for decorating the icecream with honey
 * 
 */
public class HoneyDecorator extends IceCreamDecorator {

	public static final String ADD_HONEY = "Adding Honey ";

	public HoneyDecorator(final Icecream icecream) {
		super(icecream);
	}

	@Override
	public String makeIcecream() {
		return icecream.makeIcecream() + addHoney();
	}

	/**
	 * This method will add the honey to icecream and return the description
	 * 
	 * @return description of honey docaration
	 */
	private String addHoney() {
		return ADD_HONEY;
	}
}
