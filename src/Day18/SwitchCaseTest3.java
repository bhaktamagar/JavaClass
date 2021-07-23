package Day18;

import java.util.Scanner;

public class SwitchCaseTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, Enter choice case: add, sub, mult, and div: ");
		String choice = sc.next();
		int a = 0, b = 0;
		System.out.print("Enter number1: ");
		a = sc.nextInt();
		System.out.print("Enter number2: ");
		b = sc.nextInt();
		switch (choice) {
		case "add":
			int sum = a + b;
			System.out.println("The sum is: " + sum);
			break;
		case "sub":
			int sub = a - b;
			System.out.println("The substraction is: " + sub);
			break;
		case "mult":
			int mult = a * b;
			System.out.println("The multiplication is: " + mult);
			break;
		case "div":
			int div = a / b;
			System.out.println("The division is: " + div);
			break;
		default:
			System.out.println("Wrong Process");
		}
		System.out.println("You got it");
	}

}
