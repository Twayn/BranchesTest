package code;

public class Main {
	public static void main(String[] args) {
		Bread chunk = new Bread(12);
		Duck duck = new Duck("John");
		duck.feed(chunk);
	}


	static class Duck {
		private final String name;

		Duck(String name) {
			this.name = name;
		}

		void feed(Bread bread) {
			System.out.println("Duck " + name + " was fed by " + bread.cal + " calories bread");
		}
	}

	static class Bread {
		Bread(int cal) {
			this.cal = cal;
			System.out.println("Bread of " + cal + " calories was created");
		}

		int cal;
	}
}
