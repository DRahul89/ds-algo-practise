package src.main.java.creational.builderpattern;

/**
 * 
 * This class Nutritionfacts on which builder pattern is used for instantiating its
 * object
 * 
 */
public class NutritionFacts {
	/**
	 * contains the serving size value of {@NutritionFacts}
	 */
	private final int servingSize;
	/**
	 * contains the servings value of {@NutritionFacts}
	 */
	private final int servings;
	/**
	 * contains the calories value of {@NutritionFacts}
	 */
	private final int calories;
	/**
	 * contains the fat value of {@NutritionFacts}
	 */
	private final int fat;
	/**
	 * contains the sodium value of {@NutritionFacts}
	 */
	private final int sodium;
	/**
	 * contains the carbohydrate value of {@NutritionFacts}
	 */
	private final int carbohydrate;

	/**
	 * 
	 * This inner Builder class is used for building the instance of NutritionFacts
	 * class with required number of instance fields
	 * 
	 */
	public static class Builder {
		// Required parameters
		private final int servingSize;
		private final int servings;

		// Optional parameters - initialized to default values
		private int calories = 0;
		private int fat = 0;
		private int carbohydrate = 0;
		private int sodium = 0;

		public Builder(final int servingSize,final int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(final int val) {
			calories = val;
			return this;
		}

		public Builder fat(final int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(final int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(final int val) {
			sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(final Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}

	/**
	 * @return the calories
	 */
	protected int getCalories() {
		return calories;
	}

}