package programs;

public class Participant {
	private static int counter;
	private String registrationId;
	private String name;
	private long contactNumber;
	private String city;
	static {
		Participant.counter=10000;
	}
	
	public Participant(String name, long contactNumber, String city) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.registrationId = "D" + (counter+1);
		this.city = city;
		counter++;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Participant.counter = counter;
	}
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
