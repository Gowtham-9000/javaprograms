package programs;

public class Static3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Booking booking1 = new Booking("jack@email.com",100);
		Booking booking2 = new Booking("jill@email.com",350);
//		Booking booking3 = new Booking("john@email.com",50);
		
		Booking[] bookings = {booking1,booking2};
		for(Booking booking: bookings) {
			if(booking.isBooked()) {
				System.out.println(booking.getSeatsRequired()+" are succesfully booked for "+booking.getCustomerEmail());
				System.out.println("Remaining seats available is "+Booking.getSeatsAvailable());
			}else {
				System.out.println("Sorry "+ booking.getCustomerEmail()+ " , required number of seats are not available!");
				System.out.println("Seats available "+Booking.getSeatsAvailable());
			}
		}

	}

}
