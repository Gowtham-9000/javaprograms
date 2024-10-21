package programs;

class Rectangle {
    //Implement your code here   
    private float length,width;
    public double area(){
//        return (float)length * (float)width; 
    	double area = length * width;
    	return Math.round((area*100)/100);
    }
    public double perimeter(){
//        return 2*((float)length+(float)width);
    	double perimeter = 2*(length+width);
    	return Math.round((perimeter*100)/100);
    }
    public float getLength(){
        return length;
    }
    public float getWidth(){
        return width;
    }
    public void setLength(float length){
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }
}


//class Tester {
//	public static void main(String args[]) {
//
//		// length()
//		String str = "Welcome";
//		System.out.println(str.length());
//
//		// concat()
//		String s = "Hello";
//		s.concat(" World");
//		System.out.println(s);
//		// s is still "Hello"
//		// String objects are immutable which means they cannot be changed
//		// Here, when we concat the two strings a new string object gets created
//
//		String s1 = s.concat("World");
//		System.out.println(s1);
//
//		// + operator can also be used for string concatenation
//		String fname = "Jack";
//		String lname = "Black";
//		System.out.println(fname + " " + lname);
//
//		// equals()
//		System.out.println(s.equals("Hello"));
//
//		// equals compares only the values of the strings
//		String s2 = new String("Hello");
//		System.out.println(s.equals(s2));
//
//		// == compares the object reference and will return false in the below
//		// case
//		System.out.println(s == s2);
//
//		// equalsIgnoreCase()
//		System.out.println(s.equalsIgnoreCase("hello"));
//
//		// toLowerCase() and toUpperCase()
//		System.out.println(str.toLowerCase());
//		System.out.println(str.toUpperCase());
//
//		// substring()
//		String subs = "Learning is fun";
//		System.out.println(subs.substring(4, 8));
//		System.out.println(subs.substring(4));
//
//		// charAt()
//		System.out.println(subs.charAt(10));
//
//		// contains()
//		System.out.println(subs.contains("is"));
//
//		// replace()
//		System.out.println(subs.replace('i', 'k'));
//	}
//
//}
//
////Program to illustrate the use of multidimensional array  
//class Tester {
//	public static void main(String[] args) {
//		// Declaring and initializing 2D array
//		int[][] dayWiseTemperature = new int[][] { { 29, 21 }, { 24, 23 },
//				{ 26, 22 }, { 28, 23 }, { 29, 24 }, { 23, 20 }, { 29, 21 } };
//
//		// Displaying 2D array
//		for (int i = 0; i < 7; i++) {
//			for (int j = 0; j < 2; j++) {
//				if (j == 0)
//					System.out.println("Max Temperature is "
//							+ dayWiseTemperature[i][j] + " on day " + i);
//				else
//					System.out.println("Min Temperature is "
//							+ dayWiseTemperature[i][j] + " on day " + i);
//			}
//		}
//	}
//}
//
//public class Restaurant {
//	private String restuarnatName;
//	private long[] restaurantContacts;
//	private String restaurantAddress;
//	private float rating;
//	
//	public Restaurant(String name, long[] restaurantContacts, String restaurantAddress, float rating) {
//	this.restuarnatName = name;
//	this.restaurantContacts = restaurantContacts;
//	this.restaurantAddress = restaurantAddress;
//	this.rating = rating;
//	}
//	
//	public String getRestuarnatName() {
//		return restuarnatName;
//	}
//	public void setRestuarnatName(String restuarnatName) {
//		this.restuarnatName = restuarnatName;
//	}
//	public long[] getRestaurantContact() {
//		return restaurantContacts;
//	}
//	public void setRestaurantContact(long[] restaurantContacts) {
//		this.restaurantContacts = restaurantContacts;
//	}
//	public String getRestaurantAddress() {
//		return restaurantAddress;
//	}
//	public void setRestaurantAddress(String restaurantAddress) {
//		this.restaurantAddress = restaurantAddress;
//	}
//	public float getRating() {
//		return rating;
//	}
//	public void setRating(float rating) {
//		this.rating = rating;
//	}
//	public void displayRestaurantDetails() {
//	System.out.println("Displaying restaurant details \n***************");
//	System.out.println("Restaurant Name : "+this.restuarnatName);
//	System.out.println("Restaurant Rating : "+this.rating);
//	System.out.println("Restaurant Contacts:");
//	for (int index = 0; index < this.restaurantContacts.length; index++)
//		System.out.println(this.restaurantContacts[index]);
//	System.out.println("Restaurant Address : "+this.restaurantAddress);
//	System.out.println();
//	}
//}
//public class Tester {
//	public static void main(String[] args) {
//		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
//		Restaurant restaurant1 = new Restaurant("SwiftFood",
//				restaurantContacts, "Carolina Street, Springfield, 62702", 4.1f);
//		restaurant1.displayRestaurantDetails();
//	}
//}
//
//public class Tester {
//	public static void main(String[] args) {
//
//		int a[][] = { { 1, 3, 4 }, { 2, 3, 6 }, { 7, 6, 5 } };
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[0].length; j++) {
//				if (a[i][j] % 2 == 0)
//					break;
//				sum += a[i][j];
//			}
//		}
//		System.out.println("sum = " + sum);
//	}
//
//}
//public class Tester {
//	public static void main(String s[]) {
//		int a[] = { 12, 15, 16, 17, 19, 23 };
//		for (int i = a.length - 1; i > 0; i--) {
//			if (i % 3 != 0) {
//				--i;
//			}
//			System.out.println(a[i]);
//		}
//	}
//
//}
//public class Tester {
//	public static void main(String args[]) {
//		int[][] inputArray = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
//		int total = 1;
//
//		for (int i = 0; i < inputArray.length; i++) {
//			for (int j = 1; j < inputArray[i].length - 1; j++) {
//				total *= inputArray[i][j];
//			}
//		}
//		System.out.println("Result = " + total);
//	}
//
//}
//public class Tester {
//	public static void main(String args[]) {
//		int[][] inputArray = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
//		int total = 1;
//
//		for (int i = 0; i < inputArray.length; i++) {
//			for (int j = 1; j < inputArray[i].length - 1; j++) {
//				total *= inputArray[i][j];
//			}
//		}
//		System.out.println("Result = " + total);
//	}
//
//}
//public class Tester {
//	public static void main(String args[]) {
//		int[][] numbers = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
//		int total = 0;
//
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				if (i == j)
//					continue;
//				total += numbers[i][j];
//			}
//		}
//		System.out.println("Result = " + total);
//	}
//
//}
//
//Which of the following are valid array declarations?
//
//1) int myArray1[5];
//
//2) int myArray2[];
//
//3) int myArray3[]=new int[5];
//
//4) int myArray4[5]=new int[5];
//
//5) int []myArray5=new int[5];
//
//6) int myArray6[]=new int[];
//
//7) int myArray7[]=null;
//
//1, 2, 3, 6
//2, 4, 5, 7
//2, 3, 5, 7 
//3, 4, 5, 7
//Option 2, 3, 5, 7 is Correct
//
//Q2 of 8
//
//Which of the following statements is/are valid?
//
//int score[][] = new int[2][]; 
//int score[][] = new int[2][2]; 
//int score[][] = new int[][3];
//int score[][] = new int[2][];   score[0] = new int[2]; 
//Option int score[][] = new int[2][]; is Correct
//
//Option int score[][] = new int[2][2]; is Correct
//
//Option int score[][] = new int[2][];   score[0] = new int[2]; is Correct
//
//Q3 of 8
//
//What will be the output of the below code?
//
//public class Tester {
//	public static void main(String args[]) {
//		int arr[] = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		int n = 6;
//		n = arr[arr[n] / 2];
//		System.out.println(arr[n] / 2);
//	}
//
//}
// 
//
//3
//6
//0
//1 
//Option 1 is Correct
//
//Q4 of 8
//
//What will be the output of the below code?
//
//public class Tester {
//	public static void main(String[] args) {
//		int sum = 0, count = 0;
//		int[] sales = { 6, 9, 7, 10, 11, 9, 7, 12, 14, 15, 13, 11 };
//		for (int index = 0; index < sales.length; index++) {
//			sum += sales[index];
//		}
//		float average = (float) sum / sales.length;
//		for (int sale : sales) {
//			if (sale > average)
//				count++;
//			break;
//		}
//		System.out.println("Average sales: " + average);
//		System.out.println("Sales above average: " + count);
//	}
//
//}
// 
//
//Average sales: 10.0 Sales above average: 0
//Average sales: 10.333333 Sales above average: 6
//Average sales: 10.333333 Sales above average: 0 
//Average sales: 10.0 Sales above average: 6
//Option Average sales: 10.333333 Sales above average: 0 is Correct
//
//Q5 of 8
//
//What will be the output of the below code?
//
//public class Tester {
//	public static void main(String[] args) {
//
//		int a[][] = { { 1, 3, 4 }, { 2, 3, 6 }, { 7, 6, 5 } };
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[0].length; j++) {
//				if (a[i][j] % 2 == 0)
//					break;
//				sum += a[i][j];
//			}
//		}
//		System.out.println("sum = " + sum);
//	}
//
//}
// 
//
//sum = 19
//sum = 11 
//sum = 2
//sum = 37
//Option sum = 11 is Correct
//
//Q6 of 8
//
//What will be the output of the below code?
//
//public class Tester {
//	public static void main(String s[]) {
//		int a[] = { 12, 15, 16, 17, 19, 23 };
//		for (int i = a.length - 1; i > 0; i--) {
//			if (i % 3 != 0) {
//				--i;
//			}
//			System.out.println(a[i]);
//		}
//	}
//
//}
// 
//
//23 19 16 15
//23 19 17 16 15
//19 17 15 
//Throws ArrayIndexOutOfBoundsException
//Option 19 17 15 is Correct
//
//Q7 of 8
//
//What will be the output of the below code?
//
//public class Tester {
//	public static void main(String args[]) {
//		int[][] inputArray = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
//		int total = 1;
//
//		for (int i = 0; i < inputArray.length; i++) {
//			for (int j = 1; j < inputArray[i].length - 1; j++) {
//				total *= inputArray[i][j];
//			}
//		}
//		System.out.println("Result = " + total);
//	}
//
//}
// 
//
//Result = 72 
//Result = 864
//Result = 3456
//Compilation error: all the rows are not of same size
//Option Result = 72 is Correct
//
//Q8 of 8
//
//What will be the output of the below code?
//
//public class Tester {
//	public static void main(String args[]) {
//		int[][] numbers = { { 3, 2, 3, 6 }, { 2, 4 }, { 9 }, { 2, 3, 4, 2 } };
//		int total = 0;
//
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				if (i == j)
//					continue;
//				total += numbers[i][j];
//			}
//		}
//		System.out.println("Result = " + total);
//	}
//
//}
// 
//
//Result = 11
//Result = 20
//Result = 24
//Result = 31 
//Option Result = 31 is Correct
//
//class Tester {
//    
//    public static int calculateSumOfEvenNumbers(int[] numbers){
//        //Implement your code here and change the return value accordingly
//        int sum = 0;
//        for(int i= 0;i<numbers.length;i++){
//            if(numbers[i]%2==0){
//                sum+=numbers[i];
//            }
//        }
//        return sum;
//    }
//    
//	public static void main(String[] args) {
//		int[] numbers = {68,79,86,99,23,2,41,100};
//		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
//	}
//}
//
//class Tester{
//    
//    public static String moveSpecialCharacters(String str){
//		//Implement your code here and change the return value accordingly
//		StringBuilder specialCharacters = new  StringBuilder();
//		StringBuilder otherCharacters = new StringBuilder();
//		
//		for(int i=0; i<str.length();i++){
//		    char c = str.charAt(i);
//		    if(!Character.isLetterOrDigit(c)){
//		        specialCharacters.append(c);
//		    }else{
//		        otherCharacters.append(c);
//		    }
//		    
//		}
//		otherCharacters.append(specialCharacters);
//        return otherCharacters.toString();
//	}
//	
//	public static void main(String args[]){
//	    String str = "He@#$llo!*&";
//	    System.out.println(moveSpecialCharacters(str));
//	}
//	
//}
//class Tester{
//    public static boolean checkPalindrome(String str){
//	    //Implement your code here and change the return value accordingly
//	    StringBuilder reverse = new StringBuilder();
//	    for(int i = str.length()-1; i>=0;i--){
//	        char c = str.charAt(i);
//	        reverse.append(c);
//	    }
//        return str.equals(reverse.toString());
//	    
//	}
//	
//	public static void main(String args[]){
//		String str = "radar";
//		if(checkPalindrome(str))
//			System.out.println("The string is a palindrome!");
//		else
//			System.out.println("The string is not a palindrome!");
//	}
//}
//
//class Tester {
//public static String reverseEachWord(String str) {
//        String[] words = str.split(" ");
//        StringBuilder reversedStr = new StringBuilder();
//      
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            String reversedWord = reverseWord(word);
//            reversedStr.append(reversedWord);
//          
//            if (i < words.length - 1) {
//                reversedStr.append(" ");
//            }
//        }
//        return reversedStr.toString();
//    }
//
//  
//    private static String reverseWord(String word) {
//        char[] chars = word.toCharArray();
//        int start = 0;
//        int end = chars.length - 1;
//        
//        //  reverse the word
//        while (start < end) {
//            char temp = chars[start];
//            chars[start] = chars[end];
//            chars[end] = temp;
//            start++;
//            end--;
//        }
//        
//        return new String(chars);
//    }
//
//	
//	public static void main(String args[]){
//	    String str = "all cows eat grass";
//	    System.out.println(reverseEachWord(str));
//	}
//}