package Day20;

import java.util.Scanner;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.print("Please, Enter any name: ");
			String name = sc.next();
			System.out.println("Name is: " + name);
			if (name.equals("bhakta")) {
				flag = false;
			}
			System.out.println("Exit");
		}
	}

}
