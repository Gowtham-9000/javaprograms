package programs;

public class Calculator {
	private int num;
	public int sumOfDigits() {
		int temp = num;
		int sum =0;
		while(temp>0) {
			int digits = temp%10;
			sum+=digits;
			temp/=10;
		}
		return sum;
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num= num;
	}

}
