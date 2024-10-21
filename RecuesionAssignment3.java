package programs;

public class RecuesionAssignment3 {
	public static int findGCD(int num1, int num2) {
		if(num2==0) {
			return num1;
		}
		return findGCD(num2,num1%num2);
	}
    public static int findMax(int num1, int num2) {
    	return (num1>num2?num1:num2);
    }
    public static int findMin(int num1,int num2) {
    	return (num1<num2?num1:num2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findGCD(5,10));
		

	}

}
