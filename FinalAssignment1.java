package programs;

class Circle{
	private final double pi = 3.14;
	private double diameter;
	private double circumference;
	private double area;
	Circle(double diameter){
		this.diameter = diameter;
	}
	
	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getCircumference() {
		return circumference;
	}

	public void setCircumference(double circumference) {
		this.circumference = circumference;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void calculateCircumference() {
		setCircumference(pi*getDiameter());
	}
	public void calculateArea() {
		setArea(pi*(getDiameter()/2)*(getDiameter()/2));
	}
}

public class FinalAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle(10.2);
		Circle circle2 = new Circle(5.7);
		
		Circle[] circles = {circle1,circle2};
		
		for(Circle circle: circles) {
			circle.calculateCircumference();
			circle.calculateArea();
			
			System.out.println("Diameter of the circle is "+circle.getDiameter());
			System.out.println("Cicumference of the circlr is "+Math.round(circle.getCircumference()*100)/100.0);
			System.out.println("Area of the circle is "+Math.round(circle.getArea()*100)/100.0);
			System.out.println();
		}

	}

}
