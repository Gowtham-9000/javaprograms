package operationonintegers;
import java.util.*;

public class ExponentAndBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base");
		int base = sc.nextInt();
		System.out.println("Enter Exponent");
		int exp = sc.nextInt();
		int result =1;int i=1;
		do {
			result*=base;
			i++;
		}while(i<=exp);
		System.out.println(result);
         
	}

}
