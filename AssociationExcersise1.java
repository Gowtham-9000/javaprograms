package programs;

public class AssociationExcersise1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	   CabServiceProvider cabServiceProvide1 = new CabServiceProvider("Halo",50);
    	   
    	   Driver driver1= new Driver("Sai",4.8f);
    	   Driver driver2 = new Driver("Mark",4.2f);
    	   Driver driver3 = new Driver("David",3.9f);
    	   Driver[] driverList = {driver1,driver2,driver3};
    	   for(Driver driver: driverList) {
    		   System.out.println("Driver Name: "+driver.getDriveName());
    		   double bonus = cabServiceProvide1.calculateRewardPrice(driver);
    		   if(bonus > 0) {
    			   System.out.println("Bonus: "+bonus+"\n");
    		   }else {
    			   System.out.println("Sorry your bonus is not avilable");
    		   }
    	   }
		

	}

}
