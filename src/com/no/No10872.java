package com.no;

import java.util.Scanner;

public class No10872 {
	static int as = 1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int CountA = sc.nextInt();
		System.out.println(factorial(CountA));
		sc.close();
	}

	private static int factorial(int a) {

		if (a == 0) {
			
			return as;
		} else {
			as *= a;
			a--;
			return factorial(a);
		}
	
	}
	
}
