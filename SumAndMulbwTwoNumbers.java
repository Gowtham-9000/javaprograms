package operationonintegers;

import java.util.Scanner;

public class SumAndMulbwTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		int mul =1;
		if(a<b) {
			for(int i=a+1;i<b;i++) {
				sum +=i;
				mul *=i;
			
			}
		}else {
			for(int i=b+1;i<a;i++) {
				sum+=i;
				mul*=i;
			}
		}
		System.out.println(sum+" "+mul);

	}

}
