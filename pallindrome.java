package projectTwo;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {

		System.out.println("Please enter number  ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int num = x;
		int newNum = 0;
		int a = 0;
		for (int b = 0; b < b + 1; b++) {
			a = num % 10;
			num = num / 10;
			newNum = newNum * 10 + a; 
			if (num == 0) {
				break;
			}
		}
		if (newNum == x) {
			System.out.println("pallindrom");
		} else {
			System.out.println("not pallindrom");
		}

	}

}
