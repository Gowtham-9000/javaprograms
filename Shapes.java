package printingshapes;

import java.util.Scanner;

public class Shapes {
	public static void main(String[] args) {
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			for(int k=6;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("................");
		for(int i=1;i<=6;i++) {
		   for(int j=1;j<=i;j++) {
			   System.out.print("*");
		   }
		   for(int k=i;k<=6;k++) {
			   System.out.print(k);
		   }
		   System.out.println();
		}
		System.out.println("...............");
		for(int i=0;i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			for(int k=6;k>i;k--) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("...........");
		for(int a=1,b=10,c=11,d=20,e=21,f=30;a<=10;a++,b--,c++,d--,e++,f--) {
			System.out.print(a+" "+b+" "+c+" "+d+" "+e+" "+f );
			System.out.println();
		}
		System.out.println(".................");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Rows :");
//		int rows = sc.nextInt();
//		System.out.println("Columns :");
//		int cols = sc.nextInt();
//		if(rows==0 || cols==0) {
//			System.out.println("You have entered the wrong details");
//		}else {
//			for(int i=0;i<=rows;i++) {
//				for(int j=0;j<=cols;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
//		}
		for(int i =6;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=6;j>=i;j--) {
				System.out.print("$");
			}
			for(int j=6;j>=i;j--) {
				System.out.print("$");
			}
			System.out.println();
		}
		System.out.println(".................");
		for(int i=0;i<=6;i++) {
			System.out.print(" ");
		}
		System.out.println("#");
		for(int i=6;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.print("#");
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.print("#");
			System.out.println();
			
		}
		for(int i=7;i>=0;i--) {
			System.out.print("# ");
		}
		System.out.println();
		System.out.println("...............");
		System.out.println();
		for(int i=0;i>=6;i++) {
			System.out.print(" ");
		}
		System.out.print("@");
		for(int i=6;i<=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.print("@");
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.print("@");
		}
	}

}
