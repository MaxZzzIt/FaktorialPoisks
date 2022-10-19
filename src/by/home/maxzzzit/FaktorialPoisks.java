package by.home.maxzzzit;

import java.util.Scanner;

public class FaktorialPoisks {
	static int fact;
	public static void main(String[]args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Введите \"n\" для факториала: ");
		int n = scn.nextInt();
		
		System.out.println(n+"! = "+factorial(n));
	}
	public static int factorial(int n) {
		if (n <= 1) return 1;
		else 		return factorial(n-1)*n;
	}
}
