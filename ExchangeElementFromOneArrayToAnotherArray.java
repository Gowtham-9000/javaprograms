package arrayprograms;

public class ExchangeElementFromOneArrayToAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1 = {'a','b','c','m','l'};
		char[] arr2 = {'d','o','p','h','k'};
		char[] arr3 = new char[5];
		System.out.println("Printing the arr1");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Printing the arr2");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		for(int i=0;i<arr1.length;i++) {
			arr3[i] = arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr1[i] = arr2[i];
		}
		for(int i=0;i<arr1.length;i++) {
			arr2[i] = arr3[i];
		}
		System.out.println();
		
		System.out.println("Printing the arr1");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("Printing the arr2");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}

	}

}
