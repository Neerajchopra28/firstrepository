package projectTwo;

import java.util.Scanner;

public class factorialWithoutLoops {

	static int fact = 1;
	public static void main(String[] args) {
		// factorial number
		System.out.println("enter intiger ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		// int fact = 1;
		System.out.println("factorial number of " + num + " is");

		System.out.println(Factorial(num));
	}

	private static int Factorial(int num) {
		if (num == 0) {
			return fact ;
		} else {
			fact = fact * num;
			Factorial(num - 1);
		}
		return fact;
	}

}
