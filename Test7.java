package day3;

import java.util.Scanner;

class Employee
{
	int eid;
	String ename;
	String edept;
	
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter employee id:");
		
		e1.eid=s1.nextInt();
		

		System.out.println("Enter employee name:");
		
		e1.ename=s1.next();
		

		System.out.println("Enter employee department name:");
		
		e1.edept=s1.next();
		
		System.out.println("Employee id is:"+e1.eid+
				"\nEmployee name:"+e1.ename+
				"\nEmployee department name:"+e1.edept);
		
		
	}

}
