package projectTwo;

import java.util.Scanner;

public class functioncalculator {

	public static void main(String[] args) {

		System.out.println("enter first intiger ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter second integer ");
		int b = sc.nextInt();

		System.out.println("enter number of operation you want to perform ");
		System.out.println("1. add ");
		System.out.println("2. subtract ");
		System.out.println("3. multiply ");
		System.out.println("4- divide  ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println(add(a, b));
			break;
		case 2:
			System.out.println(sub(a, b));
			break;
		case 3:
			System.out.println(mult(a, b));
			break;
		case 4:
			System.out.println(div(a, b));
			break;
		}
	}

	private static int add(int a, int b) {
		int sum = a + b;
		System.out.println("addition " + sum);
		return sum;
	}

	private static int sub(int a, int b) {
		int sum2 = a - b;
		System.out.println("substraction " + sum2);
		return sum2;
	}

	private static int mult(int a, int b) {
		int sum3 = a * b;
		System.out.println("multiply " + sum3);
		return sum3;
	}

	private static int div(int a, int b) {
		int sum4 = a / b;
		System.out.println("division " + sum4);
		return sum4;
	}

}
