package code;

public class PinnsvinKjottFactory implements AnimalFoodFactory {

	@Override
	public Food createFood(int cal) {
		return new Kjott(cal);
	}

	@Override
	public Animal createAnimal(String name) {
		return new Pinnsvin(name);
	}
}
