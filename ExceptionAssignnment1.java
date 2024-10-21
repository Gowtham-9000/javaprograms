package programs;

class InvalidCouponCodeException extends Exception{
	InvalidCouponCodeException(String message){
		super(message);
	}
}

class InvalidDestinationException extends Exception{
	InvalidDestinationException(String message){
		super(message);
	}
}

class InvalidTripPackageException extends Exception{
	InvalidTripPackageException(String message){
		super(message);
	}
}

class BusBooking{
	private int bookingId;
	private String destination;
	private String tripPackage;
	private double totalAmount;
	
	public BusBooking(int bookingId, String destination, String tripPackage) {
		this.bookingId = bookingId;
		this.destination=destination;
		this.tripPackage=tripPackage;
		this.totalAmount=0;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getTripPackage() {
		return tripPackage;
	}

	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public boolean validateCouponCode(String couponCode, int numberOfMembers) throws InvalidCouponCodeException {
		if(couponCode.equals("BIGBUS") && numberOfMembers>=10) {
			return true;
		}
		else if(couponCode.equals("MAGICBUS") && numberOfMembers>=15) {
			return true;
		}
		else {
			throw new InvalidCouponCodeException("Invalid coupon code");
		}
	}
    public boolean validateDestination() throws InvalidDestinationException{
    	if(this.destination.equals("Washington Dc")||
    			this.destination.equals("Philadelphia")||
    			this.destination.equals("Orlando")||
    			this.destination.equals("Boston")||
    			this.destination.equals("Atlanta")) {
    		return true;
    	}
    	else {
    		throw new InvalidDestinationException("Invalid destination");
    	}
    }
    public boolean validateTripPackage() throws InvalidTripPackageException{
    	if(this.tripPackage.equals("Regular") || this.tripPackage.equals("Premium")) {
    		return true;
    	}
    	else {
    		throw new InvalidTripPackageException("Invalid Package");
    	}
    }
    
    public String bookTrip(String couponCode, int numberOfMembers) {
    	try {
    		if(validateCouponCode(couponCode, numberOfMembers) && validateTripPackage() && validateDestination()) {
    			double price;
    			if(this.tripPackage.equals("Regular")) {
    				price =500;
    			}
    			else {
    				price=800;
    			}
    			this.totalAmount=price*numberOfMembers;
    			return "Booking successful";
    		}
    	}
    	catch(InvalidCouponCodeException|InvalidDestinationException|InvalidTripPackageException e) {
    		return e.getMessage();
    	}
    	return "Booking failed due to unknown error";
    }
}

public class ExceptionAssignnment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusBooking booking = new BusBooking(101, "Orlando", "Regular");
        String result = booking.bookTrip("BIGBUS", 11);
        if (result.equals("Booking successful")) {
            System.out.println(result);
            System.out.println("Total amount for the trip: " + booking.getTotalAmount());
        } else {
            System.out.println(result);
            System.out.println("Your booking was not successful, please try again!");
        }
    }

}
