 package projectTwo;

import java.util.Scanner;

public class perfectTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter height of Traiangle ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int a = 0;

		int starCount = 1;
		int spaceCount = height - 1;
		System.out.println("below is Star Traiangle Program");
		for (int i = 0; height > i; i++) {
			for (a = 0; a < spaceCount ; ++a) {
				System.out.print(" ");
				 
			}
			spaceCount = spaceCount-1 ;
			for (int b = 0; b < starCount; b++) {
				System.out.print("*");

			}
			System.out.println();
			starCount = starCount + 2;
		}
	}
}
