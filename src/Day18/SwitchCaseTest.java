package Day18;
import java.util.Scanner;
public class SwitchCaseTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, Enter choice case 1, 2, 3, and 4: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("This is addition");
			break;
		case 2:
			System.out.println("This is Subtraction");
			break;
		case 3:
			System.out.println("This is multiplication.");
			break;
		case 4:
			System.out.println("This is division");
			break;
				default:
					System.out.println("Wrong decision");
		}
		System.out.println("I'm out");
	}

}
