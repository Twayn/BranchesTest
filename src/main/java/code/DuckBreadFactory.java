package code;

public class DuckBreadFactory implements AnimalFoodFactory {

	@Override
	public Food createFood(int cal) {
		return new Bread(cal);
	}

	@Override
	public Animal createAnimal(String name) {
		return new Duck(name);
	}
}
