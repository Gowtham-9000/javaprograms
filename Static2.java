package programs;

public class Static2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Participant participant1 = new Participant("Franklin",7845612234L,"Texas");
        Participant participant2 = new Participant("Merina",7890123112L,"New York");
	    Participant[] participants = {participant1,participant2};
	    
	    for(Participant participant: participants) {
	    	System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
	    }
	}

}
