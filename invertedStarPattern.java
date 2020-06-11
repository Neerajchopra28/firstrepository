package projectTwo;

import java.util.Scanner;

public class invertedStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter height of Traiangle ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int a = 0;
		System.out.println("below is Star Traiangle Program");
		for (int i = 0; height > i ; --height) {
			for (a = 0; a < height; ++a) {
				System.out.print("*");
			}
			System.out.println();

		}
  
	}

}
