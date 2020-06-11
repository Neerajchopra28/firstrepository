package projectTwo;

import java.util.Scanner;

public class facorialNumber {

	public static void main(String[] args) {
		// factorial number
		System.out.println("enter intiger ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = 1;
		System.out.println("factorial number of " + num + " is");

		for (int i = 1 ; i <= num ; i++) {
			fact = fact * i;
			
		}	
		
		System.out.println(fact);
	}

}
