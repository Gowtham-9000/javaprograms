package operationonintegers;

public class ModdAndAeven {
	public static void main(String[] args) {
		
	int odd=1,even=0;
		for(int i=1;i<=20;i+=2) {
			odd*=i;
		}
		for(int i=2;i<=100;i+=2) {
			even+=i;
		}
		System.out.println(odd+" "+even);
	}

}
