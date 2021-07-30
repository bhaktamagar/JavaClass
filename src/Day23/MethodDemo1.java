package Day23;

public class MethodDemo1 {

	public void greet() {
		System.out.println("Hello, Good morning..");
	}
	public void displayInfo(String name, int age, double salary) {
		System.out.println("name is:" + name);
		System.out.println("age is:" + age);
		System.out.println("salary is:" + salary);
	}
	public static void main(String[] args) {
		MethodDemo1 obj = new MethodDemo1();
		obj.greet();
		obj.displayInfo("Himal", 44, 2200.67);
	}

}
