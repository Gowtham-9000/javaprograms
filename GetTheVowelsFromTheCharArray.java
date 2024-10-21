package arrayprograms;

public class GetTheVowelsFromTheCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'s','d','q','y','a','i','o'};
		char[] arr1= {'a','i','e','o'};
		
		System.out.println("Printing the vowels from the given data");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
			if(arr[i] == arr1[j]) {
				System.out.println(arr[i]);
			}
			}
		}
	}

}
