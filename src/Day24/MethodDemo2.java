package Day24;

public class MethodDemo2 {
	public int sum() {
		int a = 5;
		int b = 6;
		int s = a + b;
		return s;
//		System.out.println("Sum is: ");
	}

	public int findMax(int a, int b) {
		int max = 0;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
//		System.out.println("Max is: " + max);
		return max;
	}

	public void findAverage(int s) {
		double avg = s / 2;
		System.out.println(avg);

	}

	public static void main(String[] args) {

		MethodDemo2 ob = new MethodDemo2();
		int r = ob.sum();
		System.out.println("Sum is:" + r);
		ob.findAverage(r);
		int a = 5;
		int b = 4;
		int max = ob.findMax(a, b);
		System.out.println("Max is:" + max);
		
//		double d=Math.sqrt(5);
//		System.out.println(d);
	}
}