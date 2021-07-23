package Day18;

import java.util.Scanner;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, Enter choice case: +, -, *, and /: ");
		char choice = sc.next().charAt(0);
		int a = 0, b = 0;
		if(choice == '+' || choice == '-' || choice == '*' || choice == '/') {		
		System.out.print("Enter number1: ");
		a = sc.nextInt();
		System.out.print("Enter number2: ");
		b = sc.nextInt();
		}
		switch (choice) {
		case '+':
			int sum = a + b;
			System.out.println("The sum is: " + sum);
			break;
		case '-':
			int subs = a - b;
			System.out.println("The substraction is: " + subs);
			break;
		case '*':
			int mult = a * b;
			System.out.println("The multiplication is: " + mult);
			break;
		case '/':
			int div = a / b;
			System.out.println("The division is: " + div);
			break;
		default:
			System.out.println("Wrong Process");
		}
		System.out.println("You got it");
	}

}
