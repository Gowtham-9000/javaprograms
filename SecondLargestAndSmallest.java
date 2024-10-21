package arrayprograms;

public class SecondLargestAndSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {50,20,15,35,85};
		int small = arr[0],large=arr[0];
		int sSmall=-1,lLarge=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				sSmall=small;
				small = arr[i];
			}
			if(arr[i]>large) {
				lLarge=large;
				large = arr[i];
			}
		}
		System.out.println("Second Large: "+lLarge+" Second Small: "+sSmall);
		
	}

}
