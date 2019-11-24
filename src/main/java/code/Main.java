package code;

public class Main {
	public static void main(String[] args) {
		AnimalFoodFactory factory = new DuckBreadFactory();
		Animal john = factory.createAnimal("John");
		Food food = factory.createFood(40);
		john.feed(food);

		AnimalFoodFactory factory2 = new PinnsvinKjottFactory();
		Animal odin = factory2.createAnimal("Odin");
		Food food2 = factory2.createFood(60);
		odin.feed(food2);
	}
}
