package Recursion;

public class BasicRecursionProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNumber(5);

	}
	public static void printNumber(int num) {
		if(num ==0) {
			return;
		}
		else {
			System.out.print(num+" ");
			printNumber(num-1);
		}
	}

}

// The function call itself and makes the processing of the code can be termed as recursion 
// It has base case to stop the execution of program at the some point of program
// It has general case to process the action of the code 