package programs;

public class Booking {
	private String customerEmail;
	private int seatsRequired;
	private boolean isBooked;
	private static int seatsAvailable;
    static {
    	seatsAvailable=400;
    }
	public Booking(String customerEmail, int seatsRequired) {
		super();
		this.customerEmail = customerEmail;
		this.seatsRequired = seatsRequired;
		if(seatsRequired<seatsAvailable) {
			this.isBooked = true;
			seatsAvailable-=seatsRequired;
		}else {
			this.isBooked=false;
		}
		
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public int getSeatsRequired() {
		return seatsRequired;
	}
	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}
	public boolean isBooked() {
		return isBooked;
	}
	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}
	public static int getSeatsAvailable() {
		return seatsAvailable;
	}
	public static void setSeatsAvailable(int seatsAvailable) {
		Booking.seatsAvailable = seatsAvailable;
	}
	

}
