package projectTwo;

import java.util.Scanner;

public class secondProgram {

	public static void main(String[] args) {
		// TODO Triangle program
		System.out.println("Please enter height of Traiangle ");
		Scanner sc = new Scanner(System.in);
		int Height = sc.nextInt();
		int a = 0;
		System.out.println("below is Star Traiangle Program");
		for (int i = 1; i <= Height; ++i) {
			for (a = 1; a <= i; ++a) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

}
