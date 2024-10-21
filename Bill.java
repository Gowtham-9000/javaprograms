package programs;

public class Bill {
       private static int counter;
       private String billId;
       private String paymentMode;
       public Bill(String paymentMode) {
    	   this.paymentMode = paymentMode;
    	   String bId = "B" + Integer.toString(Bill.counter);
    	   counter++;
    	   setBillId(bId);
       }
       static {
    	   counter = 9001;
       }
       public static int getCounter() {
    	   return Bill.counter;
       }
       public String getBillId() {
    	   return this.billId;
       }
       public void setBillId(String billId) {
    	   this.billId = billId;
       }
       public String getPaymentMode() {
    	   return paymentMode;
       }
       public void setPaymentMode(String paymentMode) {
    	   this.paymentMode = paymentMode;
       }
}
