package projectTwo;

import java.util.Scanner;

public class AttendanceChecking {

	public static void main(String[] args) {
		/*
		 * A student will not be allowed to sit in exam if his/her attendence is less
		 * than 75%. Take following input from user Number of classes held a Number of
		 * classes attended b. (b/a)*100 And print Percentage of class attended Is
		 * Student is allowed to sit in exam or not.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of classes held ");
		int a = sc.nextInt();
		System.out.println("Enter number of classes attended ");
		int b = sc.nextInt();
		int c = (b * 100 / a);
		if (c >= 75) {
			System.out.println("you are allowed to sit " + c);
		} else {
			System.out.println("not allowed " + c);
		}
	}

}
