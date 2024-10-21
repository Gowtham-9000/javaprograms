package programs;

//Implement the class Bill based on the class diagram and description given below.
//
//
//
//Method Description
//
//Bill(String paymentMode)
//
//Initialize the paymentMode instance variable with the value passed to the parameter. 
//
//Generate the billId using counter. The value of billId should start from 'B9001' and the numerical part should be incremented by 1 for the subsequent values. Initialize the counter in static block.
//
//Implement the appropriate getter and setter methods.
//
// 
//
//Test the functionalities using the provided Tester class. Create two or more Bill objects and validate that the billId is being generated properly.
//
//Sample Input and Output
//
//For constructor
//
//Input
//
//For first Bill object
//
//
//
//For second Bill object
//
//
//
//Output


public class StatiExcersise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bill bill1 = new Bill("Debit Card");
		Bill bill2 = new Bill("PayPal");
		
		Bill[] bills = {bill1,bill2};
		for(Bill bill : bills) {
			System.out.println("Bill Details");
			System.out.println("Bill Id: " + bill.getBillId());
			System.out.println("Payment Mode: "+bill.getPaymentMode());
			System.out.println();
		}

	}

}
