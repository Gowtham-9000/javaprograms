package programs;

class Point{
	private double xCoordinate;
	private double yCoordinate;
	public Point(double xCoordinate, double yCoordinate) {
		super();
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	public double calculateDistance() {
		double distance = Math.sqrt(xCoordinate*xCoordinate + yCoordinate*yCoordinate);
		distance = Math.round(distance*100.0)/100.0;
		return distance;
	}
	public double calculateDistance(Point point) {
		double deltaX = this.xCoordinate - point.xCoordinate;
		double deltaY =this.yCoordinate - point.yCoordinate;
		double distance = Math.sqrt(deltaX*deltaX + deltaY*deltaY);
		distance = Math.round(distance*100.0)/100.0;
		return distance;
	}
	public double getxCoordinate() {
		return xCoordinate;
	}
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	public double getyCoordinate() {
		return yCoordinate;
	}
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
	
}

public class MethodOverloadingExcersise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point1 = new Point(3.5,1.5);
		Point point2 = new Point(6,4);
		
		System.out.println("Distance of point1 to origin is : " +point1.calculateDistance());
		System.out.println("Distance from point2 to origin is : " +point2.calculateDistance());
		System.out.println("Distance from point 1 to point2 : " +point1.calculateDistance(point2));
		
		Point origin = new Point(0,0);
		System.out.println("Distance from origin to itself: "+origin.calculateDistance());
		System.out.println("Disteance from point1 to itself: "+point1.calculateDistance(point1));
		

	}

}
