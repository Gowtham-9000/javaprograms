package programs;
class Event{
	private String eventName;
	private String participantName;
	private double registrationFee;
    
	public Event(String eventName, String participantName) {
		super();
		this.eventName = eventName;
		this.participantName = participantName;
	}
    

	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public String getParticipantName() {
		return participantName;
	}


	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}


	public double getRegistrationFee() {
		return registrationFee;
	}


	public void setRegistrationFee(double registrationFee) {
		this.registrationFee = registrationFee;
	}


	public void registerEvent() {
		if(this.eventName.equals("Singing")) setRegistrationFee(8.0);
		else if(this.eventName.equals("Dancing")) setRegistrationFee(10.0);
		else if(this.eventName.equals("DigitalArt")) setRegistrationFee(12.0);
		else if(this.eventName.equals("Acting")) setRegistrationFee(15.0);
		else setRegistrationFee(0.0);
	}
	
}

class SoloEvent extends Event{
	private int participantNo;
	public SoloEvent(String eventName, String participantName, int participantNo) {
		super(eventName,participantName);
		this.participantNo=participantNo;
	}
	public int getParticipantNo() {
		return participantNo;
	}
	public void setParticipantNo(int participantNo) {
		this.participantNo = participantNo;
	}
	public void registerEvent() {
    super.registerEvent();
	}
}

class TeamEvent extends Event{
	private int noOfParticipants;
	private int teamNo;
	public TeamEvent(String eventName, String participantName, int noOfParticipants, int teamNo){
		super(eventName,participantName);
		this.noOfParticipants = noOfParticipants;
		this.teamNo = teamNo;
	}
	
	public int getNoOfParticipants() {
		return noOfParticipants;
	}

	public void setNoOfParticipants(int noOfParticipants) {
		this.noOfParticipants = noOfParticipants;
	}

	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	public void registerEvent() {
		if(this.getEventName().equals("Singing")) setRegistrationFee(getNoOfParticipants()*4.0);
		else if(this.getEventName().equals("Dancing")) setRegistrationFee(getNoOfParticipants()*6.0);
		else if(this.getEventName().equals("DigitalArt")) setRegistrationFee(getNoOfParticipants()*8.0);
		else if(this.getEventName().equals("Acting")) setRegistrationFee(getNoOfParticipants()*10.0);
	}
}

public class MethodOverridingAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoloEvent soloEvent = new SoloEvent("Dancing","Jacob",1);
		soloEvent.registerEvent();
		if(soloEvent.getRegistrationFee()!=0) {
			System.out.println("Thank you "+soloEvent.getParticipantName()
			        +" for your participational! your registration fee is $"+ soloEvent.getRegistrationFee());
			System.out.println("Your participant number is "+ soloEvent.getParticipantNo());
		}
		else {
			System.out.println("Please enter a valid event");
		}
		System.out.println();
		TeamEvent teamEvent = new TeamEvent("Acting", "Serena", 5, 1);
		teamEvent.registerEvent();
		if (teamEvent.getRegistrationFee() != 0) {
			System.out.println("Thank You " + teamEvent.getParticipantName()
					+ " for your participation! Your registration fee is $" + teamEvent.getRegistrationFee());
			System.out.println("Your team number is " + teamEvent.getTeamNo());
		} else {
			System.out.println("Please enter a valid event");
		}

	}

}
