package programs;

public class Method1 {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int num = 6257;
		calculator.setNum(num);
		int sumOfDigits = calculator.sumOfDigits();
		System.out.println(sumOfDigits);
		



				
				Rectangle rectangle=new Rectangle();
				//Assign values to the member variables of Rectangle class
				float length = 12f;
				float width = 5f;
				rectangle.setLength(length);
				rectangle.setWidth(width);
				double area = rectangle.area();
				double perimeter = rectangle.perimeter();
				
				

				//Invoke the methods of the Rectangle class to calculate the area and perimeter
				
				//Display the area and perimeter using the lines given below
				System.out.println("Area of the rectangle is " + area);
				System.out.println("Perimeter of the rectangle is "+ perimeter);
				
				Customer customer = new Customer();
				customer.customerName = "Jack";
				customer.payBill(500, 5);

	}

}

//class Calculator {
//
//    // Calculate the average of three integers and round it to two decimal places
//    public double findAverage(int number1, int number2, int number3) {
//        // Calculate the average
//        double average = (number1 + number2 + number3) / 3.0; // Use 3.0 to ensure floating-point division
//        
//        // Round the average to two decimal places
//        return Math.round(average * 100.0) / 100.0;
//    }
//}
//
//
//
//class Tester {
//
//    public static void main(String[] args) {
//        // Create an instance of the Calculator class
//        Calculator calculator = new Calculator();
//        
//        // Test the findAverage method of the Calculator class
//        int number1 = 10;
//        int number2 = 20;
//        int number3 = 30;
//        
//        // Invoke the method findAverage from the Calculator instance
//        double average = calculator.findAverage(number1, number2, number3);
//        
//        // Display the average
//        System.out.println("Average of the numbers is: " + average);
//    }
//}


//class MovieTicket {
//    //Implement your code here 
//    private int movieId;
//    private int noOfSeats;
//    private double costPerTicket;
//    
//    public  MovieTicket(int movieId, int noOfSeats){
//        this.movieId = movieId;
//        this.noOfSeats = noOfSeats;
//    }
//    public double calculateTotalAmount(){
//        if(movieId == 111){
//            costPerTicket = 7;
//            return noOfSeats*costPerTicket;
//        }
//        else if(movieId == 112){
//            costPerTicket = 8;
//            return noOfSeats*costPerTicket;
//        }
//        else if(movieId == 113){
//            costPerTicket = 8.5;
//            return noOfSeats*costPerTicket;
//        }
//        else{
//            return 0;
//        }
//    }
//    public int getMovieId(){
//        return movieId;
//    }
//    public void setMovieId(int movieId){
//        this.movieId = movieId;
//    }
//    public int getNoOfSeats(){
//        return noOfSeats;
//    }
//    public void setNoOfSeats(int noOfSeats){
//        this.noOfSeats = noOfSeats;
//    }
//    public double getCostPerTicket(){
//        return costPerTicket;
//    }
//    public void setCostPerTicket(double costPerTicket){
//        this.costPerTicket = costPerTicket;
//    }
//}
//
//
//class Tester {
//    public static void main(String[] args) {
//        MovieTicket movieTicket = new MovieTicket(112, 3);
//        double amount = movieTicket.calculateTotalAmount();
//        if (amount==0)
//            System.out.println("Sorry! Please enter valid movie Id and number of seats");
//        else
//            System.out.println("Total amount for booking : $" + amount);
//    }
//}


//public class MovieTicket {
//    private int movieId;
//    private int noOfSeats;
//    private double costPerTicket;
//
//    public MovieTicket(int movieId, int noOfSeats) {
//        this.movieId = movieId;
//        this.noOfSeats = noOfSeats;
//        this.costPerTicket = getCostPerTicketForMovie(movieId);
//    }
//
//    private double getCostPerTicketForMovie(int movieId) {
//        switch (movieId) {
//            case 111:
//                return 7.0;
//            case 112:
//                return 8.0;
//            case 113:
//                return 8.5;
//            default:
//                return 0.0;
//        }
//    }
//
//    public double calculateTotalAmount() {
//        if (costPerTicket == 0) {
//            return 0;  // Invalid movieId
//        }
//        return noOfSeats * costPerTicket;
//    }
//
//    public int getMovieId() {
//        return movieId;
//    }
//
//    public void setMovieId(int movieId) {
//        this.movieId = movieId;
//        this.costPerTicket = getCostPerTicketForMovie(movieId);  // Update cost if movieId changes
//    }
//
//    public int getNoOfSeats() {
//        return noOfSeats;
//    }
//
//    public void setNoOfSeats(int noOfSeats) {
//        this.noOfSeats = noOfSeats;
//    }
//}

//File: MovieTicket.java
//class MovieTicket {
//    private int movieId;
//    private int noOfSeats;
//    private double costPerTicket;
//
//    public MovieTicket(int movieId, int noOfSeats) {
//        setMovieId(movieId);
//        setNoOfSeats(noOfSeats);
//        setCostPerTicket(movieId);
//    }
//
//    // Getter methods
//    public int getMovieId() {
//        return movieId;
//    }
//
//    public int getNoOfSeats() {
//        return noOfSeats;
//    }
//
//    public double getCostPerTicket() {
//        return costPerTicket;
//    }
//
//    // Setter methods
//    public void setMovieId(int movieId){
//        this.movieId = movieId;
//    }
//
//    public void setNoOfSeats(int noOfSeats) {
//        this.noOfSeats = noOfSeats;
//    }
//
//    public void setCostPerTicket(double costPerTicket) {
//        int mID = (int) this.movieId;
//        switch (mID) {
//            case 111:
//                this.costPerTicket = 7.0;
//                break;
//            case 112:
//                this.costPerTicket = 8.0;
//                break;
//            case 113:
//                this.costPerTicket = 8.5;
//                break;
//            default:
//                this.costPerTicket = 0.0;
//                break;
//        }
//    }
//
//    public double calculateTotalAmount() {
//        double cpt = getCostPerTicket();
//        int nos = getNoOfSeats();
//        double price = cpt * nos;
//        double totalAmount = price * 1.02;
//        totalAmount = Math.round(totalAmount);
//        return totalAmount; 
//    }
//}
//
//class Tester {
//    public static void main(String[] args) {
//        MovieTicket movieTicket = new MovieTicket(112, 3);
//        double amount = movieTicket.calculateTotalAmount();
//        if (amount == 0)
//            System.out.println("Sorry! Please enter a valid movie Id and number of seats");
//        else
//            System.out.println("Total amount for booking: $" + amount);
//    }
//}

//import java.util.HashMap;
//import java.util.Map;
//
//class Tester {
//
//    public static int findHighestOccurrence(String str) {
//        // Create a map to track character frequencies
//        Map<Character, Integer> occurrenceMap = new HashMap<>();
//        for (char ch : str.toCharArray()) {
//            if (ch != ' ') {
//                occurrenceMap.put(ch, occurrenceMap.getOrDefault(ch, 0) + 1);
//            }
//        }
//
//        char highestChar = '\0';
//        int maxFrequency = 0;
//        for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
//            if (entry.getValue() > maxFrequency) {
//                highestChar = entry.getKey();
//                maxFrequency = entry.getValue();
//            }
//        }
//        // Return the highest frequency, not the character
//        return maxFrequency;
//    }
//
//    public static void main(String[] args) {
//        String str = "i am what i am";
//        System.out.println(findHighestOccurrence(str));
//    }
//}
//
//class Tester {
//
//    public static int findHighestOccurrence(String str) {
//        int[] charCount = new int[26]; // Array to count occurrences of each letter
//        int maxCount = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//
//            // Convert character to lowercase if it's uppercase
//            // if (Character.isUpperCase(c)) {
//            //     c = Character.toLowerCase(c);
//            // }
//
//            // Check if the character is between 'a' and 'z'
//            // if (c >= 'a' && c <= 'z') {
//                int index = c - 'a';
//                charCount[index]++;
//                maxCount = Math.max(maxCount, charCount[index]);
//            // }
//        }
//
//        return maxCount;
//    }
//
//    public static void main(String[] args) {
//        String str = "Success"; // Example string with mixed case
//        System.out.println(findHighestOccurrence(str));
//    }
//}
//
//import java.util.HashMap;
//import java.util.Map;
//
//class Tester {
//
//    public static int findHighestOccurrence(String str) {
//        // Create a map to count occurrences of each character
//        Map<Character, Integer> occurrenceMap = new HashMap<>();
//        int maxCount = 0;
//
//        // Iterate through the string to populate the map
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//
//            // Ignore spaces and other non-alphabetic characters
//            if (Character.isLetter(c)) {
//                // Convert to lowercase to handle case insensitivity
//                c = Character.toLowerCase(c);
//                
//                // Update the count in the map
//                occurrenceMap.put(c, occurrenceMap.getOrDefault(c, 0) + 1);
//                
//                // Update the maxCount
//                maxCount = Math.max(maxCount, occurrenceMap.get(c));
//            }
//        }
//
//        return maxCount;
//    }
//
//    public static void main(String[] args) {
//        // Test the method with different strings
//        String[] testStrings = {
//            "success",            // Example where 's' is the most frequent character
//            "Hello World",        // Example with mixed case and space
//            "aaAA",               // Example with same characters in different cases
//            "abcd",               // Example with all unique characters
//            "aaaabbbbcccc"       // Example with multiple frequent characters
//        };
//
//        // Print the results for each test string
//        for (String str : testStrings) {
//            System.out.println("Highest occurrence in \"" + str + "\": " + findHighestOccurrence(str));
//        }
//    }
//}
//
////The above codes can find the occurences if spaces are contained
//
//class Tester {
//    static final int ASSCII_SIZE = 256;
//	public static int findHighestOccurrence(String str){
//		//Implement your code here and change the return value accordingly
//		int count1[] = new int[ASSCII_SIZE];
//		int count2 = 0;
//		int len = str.length();
//		int max = 0;
//		char result = ' ';
//		for(int i=0;i<len;i++){
//		    count1[str.charAt(i)] ++;
//		}
//		for(int i = 0;i<len;i++){
//		    if(max<count1[str.charAt(i)])
//		    {
//		        max=count1[str.charAt(i)];
//		        result = str.charAt(i);
//		    }
//		}
//		
//		 for(int i = 0;i<str.length();i++){
//		        if(str.charAt(i) == result)
//		        {
//		            count2++;
//		        }
//		    }
//		
//		
//		
//        return count2;
//	}
//	
//	public static void main(String args[]){
//	    String str = "success";
//	    System.out.println(findHighestOccurrence(str));
//	}
//	
//	class Tester {
//	    public static int findHighestOccurrence(String str) {
//	        int[] count = new int[256]; // ASCII size
//	        int maxCount = 0;
//
//	        // Count occurrences of each character
//	        for (int i = 0; i < str.length(); i++) {
//	            char c = str.charAt(i);
//	            count[c]++;
//	            if (count[c] > maxCount) {
//	                maxCount = count[c];
//	            }
//	        }
//
//	        return maxCount;
//	    }
//
//	    public static void main(String[] args) {
//	        String str = "success";
//	        System.out.println(findHighestOccurrence(str)); // Output should be 3 (for 's')
//	    }
//	}
//// this is another version without needing the character occurences
//}
//
//// While this code only works with the words that doesn't contain any spaces

//import java.util.HashSet;
//import java.util.Set;
//class Tester{
//    public static String removeDuplicatesandSpaces(String str){
//        //Implement your code here and change the return value accordingly
//        Set<Character> seen = new HashSet<>();
//        StringBuilder result = new StringBuilder();
//        for(char ch : str.toCharArray()){
//            if( ch != ' ' && !seen.contains(ch)){
//                seen.add(ch);
//                result.append(ch);
//            }
//        }
//        return result.toString();
//	}
//	
//	public static void main(String args[]){
//	    String str = "object oriented programming";
//	    System.out.println(removeDuplicatesandSpaces(str));
//	}
//}
