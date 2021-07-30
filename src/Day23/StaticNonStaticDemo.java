package Day23;

public class StaticNonStaticDemo {
	public void greet() {
		System.out.println("Hello, Good Evening...");
	}

	public static void sum() {
		int a = 5;
		int b = 6;
		int s = a + b;
		System.out.println("Sum is: " + s);
	}

	public static void main(String[] args) {
		System.out.println("Main Started...");

		StaticNonStaticDemo obj = new StaticNonStaticDemo();
		obj.greet();
		StaticNonStaticDemo.sum();

		System.out.println("Main End");
	}

}
