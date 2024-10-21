package programs;

public class CabServiceProvider {
	private String cabServiceName;
	private int totalCabs;
	public CabServiceProvider(String cabServiceName,int totalCabs){
		this.cabServiceName = cabServiceName;
		this.totalCabs=totalCabs;
	}
	public double calculateRewardPrice(Driver driver) {
		double rewardPrice = 0;
		if(this.cabServiceName.equals("Halo")) {
			double rating = driver.getAverageRating();
			if(rating<=5 && rating>=4.5 ) rewardPrice=rating*10;
			else if(rating<4.5 && rating>=4) rewardPrice=rating*5;
		}
		else if(this.cabServiceName.equals("Aber")) {
			double rating = driver.getAverageRating();
			if(rating<=5 && rating>=4.5) rewardPrice=rating*8;
			else if(rating<4.5 && rating>=4) rewardPrice=rating*3;
		}
		rewardPrice= Math.round(rewardPrice*100.0)/100.0;
		return rewardPrice;
	}
	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName=cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setGetTotalCabs(int totalCabs) {
		this.totalCabs=totalCabs;
	}

}
