package programs;

public class RecursionAssignment2 {
	public static double findHpSum(int n) {
		if(n==1) return 1.0;
		else return findHpSum(n-1)+(1.0/(n));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		if(n==0)
		{
			System.out.println("Please enter the valid number");
		}
		else {
			System.out.println(findHpSum(n));
		}
	}

}
