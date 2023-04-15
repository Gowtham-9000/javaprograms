package day3;

class PersonInfo{
	int page=20;
	String pname="Jhon";
	
	//returntype functioname()
	
	void display()
	{
		String paddharno="456789789878M";//local 
		System.out.println("Adhar no is:"+paddharno);
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonInfo p1=new PersonInfo();
		System.out.println(p1.page+" "+p1.pname);
		p1.display();
	}

}