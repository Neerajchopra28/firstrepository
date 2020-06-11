package projectTwo;

import java.util.Scanner;

public class tableFormationProject {

	public static void main(String[] args) {
		// table formation program 
		System.out.println("please enter number of table to want to make ");
		Scanner sc = new Scanner(System.in);
		int tableOf = sc.nextInt();
		int answer;
		for(int i = 1 ; i <= 10 ; i++) {
		  answer = tableOf * i;
		  System.out.println(tableOf + "*" + i + "=" + answer );
		}
	}

}
