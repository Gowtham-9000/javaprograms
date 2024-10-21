package programs;

public class RecursionAssignment4 {
	public static int[] reverseArray(int numbers[], int startIndex, int endIndex) {
		if(startIndex>=endIndex) return numbers;
		else {
			int temp = numbers[startIndex];
			numbers[startIndex ] = numbers[endIndex];
			numbers[endIndex] = temp;
			return reverseArray(numbers, ++startIndex, --endIndex);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[] {1,2,3,4,5};
		int reverseNumbers[] = reverseArray(numbers, 0, numbers.length-1);
		System.out.println("ReversedArray");
		for(int number : reverseNumbers) {
			System.out.print(number+ " ");
		}

	}

}
