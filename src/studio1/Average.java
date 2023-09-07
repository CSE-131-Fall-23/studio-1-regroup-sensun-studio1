package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Give a number ");
		int num1 = in.nextInt();
		System.out.print("Give another number ");
		int num2 = in.nextInt();
		double average = (num1 + num2) / 2.0;
		System.out.println(average);
	}

}
