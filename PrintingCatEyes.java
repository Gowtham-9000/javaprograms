package Recursion;

import java.util.Scanner;

public class PrintingCatEyes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Printing the No. of eyes of cats ");
		System.out.println("Enter the number of cats");
		Scanner sc = new Scanner(System.in);
		int cats = sc.nextInt();
		System.out.println("Cat Eyes "+ catEyes(cats));

	}
	public static int catEyes(int cats) {
		if(cats == 0) {
			return 0;
		}
		else {
			return 2+catEyes(cats -1);
		}
	}

}
