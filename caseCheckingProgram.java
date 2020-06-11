package projectTwo;

import java.util.Scanner;

public class caseCheckingProgram {

	public static void main(String[] args) {
		System.out.println("Please enter character  ");
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);

	//	int asciiValue = a;
		if (a >= 65 && a <= 90) {
			System.out.println("Uppercase");
		} else if (a >= 97 && a <= 122) {
			System.out.println("lowercase");
		} else {
			System.out.println("enter another character");
		}

	}

}
