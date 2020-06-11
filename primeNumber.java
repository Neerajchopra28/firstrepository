package projectTwo;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {

		System.out.println("Please enter number ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divisible = 0;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
				divisible++;
			}

		}
		if (divisible == 1) {
			System.out.println("number is prime");
		} else {
			System.out.println("numbber is not prime");
		}

	}

}
