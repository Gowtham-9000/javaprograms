package operationonintegers;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int result = 0;
		int q=a;
		do {
			q=q/10;
			result++;
		}while(q!=0);
		System.out.println(result);

	}

}
