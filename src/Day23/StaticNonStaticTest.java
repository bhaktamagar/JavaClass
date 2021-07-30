package Day23;

public class StaticNonStaticTest {

	public static void main(String[] args) {
		System.out.println("Main started...");
		StaticNonStaticDemo.obj=new StaticNonStaticDemo();
		obj.greet();
		System.out.println(obj.studentName);
		StaticNonStaticDemo.sum();
		System.out.println(StaticNonStaticDemo.instituteName);
		System.out.println("Main ended");
	}

}
