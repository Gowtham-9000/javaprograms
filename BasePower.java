package Recursion;

import java.util.Scanner;

public class BasePower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the base and power");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value");
		int base = sc.nextInt();
		System.out.println("Enter the power value");
		int power = sc.nextInt();
		System.out.println(power(base,power));

	}
	public static int power(int base, int num) {
		if (num == 1) {
			return base;
		}
		else {
			return base *power(base, num-1);
		}
	}

}
