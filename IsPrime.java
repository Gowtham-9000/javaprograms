package operationonintegers;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number to check weather it is prime or not");
		boolean isPrime = true;
		int a = sc.nextInt();
		
		for(int i =2;i<a;i++) {
			if(a%i == 0) {
				isPrime = false;
			}
		}
		if(isPrime == true) {
			System.out.println("The first number is prime number");
		}else {
			System.out.println("The first number is not a prime number");
		}
		

	}

}
