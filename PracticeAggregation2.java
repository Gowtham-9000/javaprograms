package programs;

class Room{
	private int roomNo;
	private int capacity;
	private static int roomCounter;
	static {
		roomCounter = 500;
	}
	Room(){
		this.roomNo = Room.roomCounter;
		this.capacity=4;
		roomCounter++;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public static int getRoomCounter() {
		return roomCounter;
	}
	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}
	@Override
	public String toString() {
		return "Room\nroomNo: "+this.roomNo+"Capacity\ncapacity: "+this.capacity;
	}
	
	
}

class Member{
	private String name;
	private int memberId;
	private Room room;
	Member(int memberId,String name){
		this.memberId = memberId;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
    public String toString(){
        return "Member\nmemberId: "+this.memberId+"\nname: "+this.name;
    }
}

class Admin{
	public void assignAdmin(Room[] room,Member member) {
		for(int i=0;i<room.length;i++) {
			if(room[i].getCapacity()<0 && member!=null) {
				room[i].setCapacity(room[i].getCapacity()-1);
				member.setRoom(room[i]);
				return ;
			}
		}
	}
}

public class PracticeAggregation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Room room5 = new Room();
		
		Room[] totalRooms = {room1,room2,room3,room4,room5};
		
		Admin admin = new Admin();
		
		Member member1 = new Member(101,"Sara");
		Member member2 = new Member(103,"harsha");
		Member member3 = new Member(104,"Saketh");
		Member member4 = new Member(105,"Avinash");
		Member member5 = new Member(106,"Sai");
		
		Member[] members = {member1,member2,member3,member4,member5};
		
	    for(Member member: members) {
	    	admin.assignAdmin(totalRooms,member);
	    	if(member.getRoom()!=null) {
	    		System.out.println("Hi " +member.getName()+" your room number is "+member.getRoom().getRoomNo());
	    	}else {
	    		System.out.println("Hi "+member.getName()+" no rooms available");
	    	}
	    	
	    }

	}

}
