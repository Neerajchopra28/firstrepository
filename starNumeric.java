package projectTwo;

import java.util.Scanner;

public class starNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Please enter height of Traiangle ");
		//Scanner sc = new Scanner(System.in);
		int height = 5;
		int value = 1;
		int a = 0;
		int num = 1;
		int numCount = 1;
		int spaceCount = height - 1;
		System.out.println("below is numeric Traiangle Program");
		for (int i = 0; height > i; i++) {
			for (a = 0; a < spaceCount ; ++a) {
				System.out.print(" ");
				
			}
			spaceCount = spaceCount-1 ;
			for (int b = 0; b < numCount; b++) {
				System.out.print(num);
				num = num + 1;
				
			}
			System.out.println();
			numCount = numCount + 2;
			num = 1;
			
		}
		
	}

}
