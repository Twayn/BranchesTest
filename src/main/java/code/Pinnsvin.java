package code;

public class Pinnsvin implements Animal {
	private String name;

	Pinnsvin(String name) {
		this.name = name;
	}

	@Override
	public void feed(Food food) {
		System.out.println("Pinnsvin " + name + " was fed by " + food);
	}
}
