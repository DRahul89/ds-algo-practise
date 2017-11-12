package src.main.java.structural.decorator;
/**
 * 
 * A class which will make a basic or simple icecream
 *
 */
public class SimpleIcecream implements Icecream{

	public static final String BASIC ="Creating the Basic IceCream  ";
	@Override
	public String makeIcecream() {
		return BASIC;
		
	}

}
