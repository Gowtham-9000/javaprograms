package arrayprograms;

import java.util.Scanner;

public class ToCheckTheNumberExits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("Enter the number to check");
		int b = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == b) {
				System.out.println("Number of index is "+i+" number is "+b);
			}
		}

	}

}
