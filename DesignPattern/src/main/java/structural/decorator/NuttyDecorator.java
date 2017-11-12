package src.main.java.structural.decorator;

/**
 * 
 * This class will be used for decorating the icecream with Nuts
 * 
 */
public class NuttyDecorator extends IceCreamDecorator {

	public static final String ADD_NUTS = "Adding Nuts ";

	public NuttyDecorator(final Icecream icecream) {
		super(icecream);
	}

	@Override
	public String makeIcecream() {
		return icecream.makeIcecream() + addNuts();

	}

	/**
	 * This method will add the Nuts to icecream and return the description
	 * 
	 * @return description of nuts docaration
	 */
	private String addNuts() {
		return ADD_NUTS;
	}
}
