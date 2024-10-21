package arrayprograms;

import java.util.Scanner;

public class ExchangeNumberFromIndexToIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int[] arr = new int[10];
		System.out.println("Enter the 10 elements");
		for(int i = 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			  System.out.print(arr[i]+ " ");
			}
		System.out.println();
		System.out.println("Num1: ");
		int a = sc.nextInt();
		System.out.println("Num2: ");
		int b= sc.nextInt();
		int index_a=0,index_b=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == a) {
				index_a=i;
			}
			if(arr[i] == b) {
				index_b=i;
			}
		}
		int c = arr[index_b];
		arr[index_b] = arr[index_a];
		arr[index_a] = c;
		for(int i=0;i<arr.length;i++) {
		  System.out.print(arr[i]+ " ");
		}

	}

}
