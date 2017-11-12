package src.main.java.creational.builderpattern;

/**
 * 
 * This is Demo class for Builder Pattern
 * 
 */
public class TestBuilderPattern {

	public static void main(String[] args) {

		System.out
				.println(new NutritionFacts.Builder(1, 2).calories(3).build());
		System.out.println(new NutritionFacts.Builder(5, 6).build());
	}

}
