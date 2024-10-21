package programs;

public class RecrsionAssignment1 {
    public static int fibonacci(int n) {
    if(n==0||n==1) return 0;
    else if(n==2) return 1;
    else return fibonacci(n-1) + fibonacci(n-2);

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n =1;
if(n!=0)
	System.out.println(fibonacci(n));
else 
	System.out.println("Please enter the valid number");
}

}
