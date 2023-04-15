package day3;

class Product
{
	int pid=1001;
	static String pname="speaker";
	static void display()
	{
		System.out.println("This static block");
	}
	void show()
	{
		System.out.println("This Nonstatic block");
	}
}//product is end
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1=new Product();
		System.out.println(p1.pid);
		System.out.println(Product.pname);
		Product.display();
		p1.show();
		
	}
	

}
