package operationonintegers;

import java.util.Scanner;

public class SmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int small =num1;
		int large =num1;
		int i=1;
		while(i<10) {
			int num2=sc.nextInt();
			if(num2<small) {
				small=num2;
			}
			if(num2>large) {
				large = num2;
			}
			i++;
		}
        System.out.println(small+" "+large);
	}

}
