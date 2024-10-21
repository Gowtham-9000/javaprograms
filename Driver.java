package programs;

public class Driver {
	private String driverName;
	private float averageRating;
	
	public Driver(String driverName, float averageRating) {
		this.driverName=driverName;
		this.averageRating=averageRating;
	}
	public String getDriveName() {
		return driverName;
	}
	public void setDiriverName(String driverName) {
		this.driverName=driverName;
	}
	@Override
	public String toString() {
		return "Driver\ndriverName: " + this.driverName+"\naverageRating: "+this.averageRating;
	}
	public float getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(float averageRating) {
		this.averageRating = averageRating;
	}

}
