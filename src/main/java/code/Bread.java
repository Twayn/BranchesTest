package code;

public class Bread implements Food {
	private final int cal;

	Bread(int cal) {
		this.cal = cal;
		System.out.println("Bread of " + cal + " calories was created");
	}

	@Override
	public String toString() {
		return cal + " calories bread";
	}
}
