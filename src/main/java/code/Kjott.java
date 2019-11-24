package code;

public class Kjott implements Food {
	private int cal;

	public Kjott(int cal) {
		this.cal = cal;
		System.out.println("Kjott of " + cal + " calories was created");
	}


	@Override
	public String toString() {
		return cal + " calories kjott";
	}
}
