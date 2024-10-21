package programs;

class Camera{
	private String brand;
	private int cost;
	
	Camera(){
		this.brand = "Nikon";
	}
	Camera(String brand, int cost){
		this.brand = brand;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
class DigitalCamera extends Camera{
	private int memory;	

	DigitalCamera(String brand, int cost){
		super(brand, cost);
		this.memory = 16;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
}

public class InheritanceExcercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalCamera obj = new DigitalCamera("Canon",100);
		System.out.println(obj.getBrand()+" "+obj.getCost()+" "+obj.getMemory());

	}

}
