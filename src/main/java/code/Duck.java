package code;

public class Duck implements Animal {
	private final String name;

	Duck(String name) {
		this.name = name;
	}

	@Override
	public void feed(Food food) {
		System.out.println("Duck " + name + " was fed by " + food);
	}
}
