package src.main.java.structural.decorator;

/**
 * 
 * A demo class for decorator pattern
 * 
 */
public class TestDecorator {

	public static void main(String[] args) {
		final Icecream icecream = new HoneyDecorator(new NuttyDecorator(
				new HoneyDecorator(new SimpleIcecream())));
		System.out.println(icecream.makeIcecream());

	}

}
