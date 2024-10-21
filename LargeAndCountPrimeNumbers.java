package operationonintegers;

import java.util.Scanner;

public class LargeAndCountPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		
		int a = sc.nextInt();
		int count = 0;
		int large = 0;
		int sum =0;
		for(int i=1;i<=a;i++) {
			boolean isPrime = true;
			for(int j=2;j<= Math.sqrt(i);j++) {
				if(i%j == 0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime ) {
				count++;
				large=i;
				System.out.println(i);
				sum+=i;
			}
		}
        System.out.println("Count: "+ count+ " Large:"+large +" Sum:"+sum);
	}

}
