package arrayprograms;

public class SimilarItemsInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,13,2,5,9,20};
		int[] arr2 = {2,13,14,16,20,21};
        for(int i=0;i<arr1.length;i++) {
        	for(int j=0;j<=i;j++) {
        	if(arr1[i] == arr2[j]) {
        		System.out.println(arr1[i]);
        	}
        	}
        }
	}

}
