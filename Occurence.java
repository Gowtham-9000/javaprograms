package programs;

public class Occurence {
        public static int findOccurence(String str) {
        	int[] count = new int[256];
        	int max = 0;
        	for(int i = 0; i<str.length();i++) {
        		char c = str.charAt(i);
        		count[c]++;
        		if(count[c]>max) {
        			max = count[c];
        		}
        	}
        	return max;
        }
        public static int  findOccurence1(String str) {
        	int[] count1 = new int[256];
        	int count2 = 0;
        	int len = str.length();
        	int maxCount = 0;
        	char result = ' ';
        	for(int i = 0; i<len;i++) {
        		count1[str.charAt(i)]++;
        	}
        	for(int i = 0;i<len;i++) {
        		if(count1[str.charAt(i)]>maxCount) {
        			maxCount = count1[str.charAt(i)];
        			result = str.charAt(i);
        		}
        	}
        	for(int i = 0; i<str.length();i++) {
        		if(str.charAt(i) == result) {
        			count2++;
        		}
        	}
        	return maxCount;
        	
        }
        // 2nd method to find the occurence
        public static void main(String[] args) {
        	String str = "success";
        	System.out.println(findOccurence1(str));
        }
        
}

//import java.util.HashMap;
//import java.util.Map;
//
//class Tester {
//
//  public static int findHighestOccurrence(String str) {
//      // Create a map to track character frequencies
//      Map<Character, Integer> occurrenceMap = new HashMap<>();
//      for (char ch : str.toCharArray()) {
//          if (ch != ' ') {
//              occurrenceMap.put(ch, occurrenceMap.getOrDefault(ch, 0) + 1);
//          }
//      }
//
//      char highestChar = '\0';
//      int maxFrequency = 0;
//      for (Map.Entry<Character, Integer> entry : occurrenceMap.entrySet()) {
//          if (entry.getValue() > maxFrequency) {
//              highestChar = entry.getKey();
//              maxFrequency = entry.getValue();
//          }
//      }
//      // Return the highest frequency, not the character
//      return maxFrequency;
//  }
//
//  public static void main(String[] args) {
//      String str = "i am what i am";
//      System.out.println(findHighestOccurrence(str));
//  }
//}
//
//class Tester {
//
//  public static int findHighestOccurrence(String str) {
//      int[] charCount = new int[26]; // Array to count occurrences of each letter
//      int maxCount = 0;
//
//      for (int i = 0; i < str.length(); i++) {
//          char c = str.charAt(i);
//
//          // Convert character to lowercase if it's uppercase
//          // if (Character.isUpperCase(c)) {
//          //     c = Character.toLowerCase(c);
//          // }
//
//          // Check if the character is between 'a' and 'z'
//          // if (c >= 'a' && c <= 'z') {
//              int index = c - 'a';
//              charCount[index]++;
//              maxCount = Math.max(maxCount, charCount[index]);
//          // }
//      }
//
//      return maxCount;
//  }
//
//  public static void main(String[] args) {
//      String str = "Success"; // Example string with mixed case
//      System.out.println(findHighestOccurrence(str));
//  }
//}
//
//import java.util.HashMap;
//import java.util.Map;
//
//class Tester {
//
//  public static int findHighestOccurrence(String str) {
//      // Create a map to count occurrences of each character
//      Map<Character, Integer> occurrenceMap = new HashMap<>();
//      int maxCount = 0;
//
//      // Iterate through the string to populate the map
//      for (int i = 0; i < str.length(); i++) {
//          char c = str.charAt(i);
//
//          // Ignore spaces and other non-alphabetic characters
//          if (Character.isLetter(c)) {
//              // Convert to lowercase to handle case insensitivity
//              c = Character.toLowerCase(c);
//              
//              // Update the count in the map
//              occurrenceMap.put(c, occurrenceMap.getOrDefault(c, 0) + 1);
//              
//              // Update the maxCount
//              maxCount = Math.max(maxCount, occurrenceMap.get(c));
//          }
//      }
//
//      return maxCount;
//  }
//
//  public static void main(String[] args) {
//      // Test the method with different strings
//      String[] testStrings = {
//          "success",            // Example where 's' is the most frequent character
//          "Hello World",        // Example with mixed case and space
//          "aaAA",               // Example with same characters in different cases
//          "abcd",               // Example with all unique characters
//          "aaaabbbbcccc"       // Example with multiple frequent characters
//      };
//
//      // Print the results for each test string
//      for (String str : testStrings) {
//          System.out.println("Highest occurrence in \"" + str + "\": " + findHighestOccurrence(str));
//      }
//  }
//}
//
////The above codes can find the occurences if spaces are contained
//
//class Tester {
//  static final int ASSCII_SIZE = 256;
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
//      return count2;
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
////this is another version without needing the character occurences
//}
//
////While this code only works with the words that doesn't contain any spaces

//class Teacher {
//    //Implement your code here
//    String teacherName;
//    String subject;
//    double salary;
//    public Teacher(String teacherName,String subject, double salary){
//        this.teacherName = teacherName;
//        this.subject = subject;
//        this.salary = salary;
//    }
//    public String getTeacherName(){
//        return teacherName;
//    }
//    public void setTeacherName(String teacherName){
//        this.teacherName = teacherName;
//    }
//    public String getSubject(){
//        return subject;
//    }
//    public void setSubject(String subject){
//        this.subject = subject;
//    }
//    public double getSalary(){
//        return salary;
//    }
//    public void setSalary(double salary){
//        this.salary = salary;
//    }
//    public void displayDetails(){
//        System.out.println("Name : " + teacherName + "Subject : "+subject+"Salary : "+salary);
//    }
//}
//
//class Tester {
//	public static void main(String[] args) {
//	    // Implement your code here 
//	    Teacher teacher1 = new Teacher("Alex","Java Fundamental",1200.0);
//	    Teacher teacher2 = new Teacher("John","RDBMS",800.0);
//	    Teacher teacher3 = new Teacher("Sam","Networking",900.0);
//	    Teacher teacher4 = new Teacher("Maria","Python",900.0);
//	    
//	    Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4};
//
//	    
//	    for(Teacher teacher: teachers){
//	        teacher.displayDetails();
//	    }
//	}
//}
//
//import java.util.Arrays;
//class Tester {
//    
//    public static double[] findDetails(double[] salary) {
//        //Implement your code here and change the return value accordingly
//        int aboveAverage = 0;
//        int belowAverage = 0;
//        
//        double salarySum = Arrays.stream(salary).sum();
//        double average = salarySum / salary.length;
//        
//        for(double entry : salary){
//            if(entry > average) aboveAverage++;
//            if(entry < average) belowAverage++;
//        }        
//        
//        return new double[]{average, aboveAverage, belowAverage};     
//    }
//       
//    public static void main(String[] args) {
//        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
//        double[] details = findDetails(salary);
//              
//        System.out.println("Average salary: "+ details[0]);
//        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
//        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
//    }
//}
//
//class Tester {
//    
//	   public static int[] findLeapYears(int year){
//	       //Implement your code here and change the return value accordingly
//	       int[] leapYears = new int[15];
//	       int index = 0;
//	       while(index<15){
//	           if(year%4==0 && year%100!=0 || year%400==0){
//	               leapYears[index] = year;
//	               index++;
//	           }
//	           year++;
//	       }
//	        return leapYears;
//	   }
//	    
//	   public static void main(String[] args) {
//	       int year = 2000;
//		   int[] leapYears;
//		   leapYears=findLeapYears(year);
//		   for ( int index = 0; index<leapYears.length; index++ ) {
//		       System.out.println(leapYears[index]);
//		   }
//	    }
//	}
//
//class Student{
//    //Implement your code here
//    private int[] marks; 
//    private char[] grade;
//    
//    public Student(int[] marks){
//        setMarks(marks);
//        grade = new char[marks.length];
//    }
//    public void setMarks(int[] marks){
//        this.marks=marks;
//    }
//    public void findGrade(){
//        char[] grade = new char[marks.length];
//        for(int i=0;i<marks.length;i++){
//            if(marks[i]>=92) grade[i] = 'E';
//            else if(marks[i]>=85 && marks[i]<92) grade[i]='A';
//            else if(marks[i]>=70 && marks[i]<85) grade[i]='B';
//            else if(marks[i]>=65 && marks[i]<70) grade[i]='C';
//            else if(marks[i]<65) grade[i]='D';
//        }
//        setGrade(grade);
//    }
//    public void setGrade(char[] grade){
//        this.grade = grade;
//    }
//    public int[] getMarks(){
//        return marks;
//    }
//    public char[] getGrade(){
//        return grade;
//    }
//}
//
//class Tester{
//	public static void main(String[] args) {
//		int[] marks = { 79, 87, 97, 65, 78, 99, 66 }; 
//		Student student = new Student(marks);
//		student.findGrade();
//        System.out.println("Grades corresponding to the marks are : ");
//		char[] grades = student.getGrade();
//		for (int index = 0; index < grades.length; index++) {
//			System.out.print(grades[index] + " ");
//		}
//	}
//}

//class Tester {
//
//	public static int[] findNumbers(int num1, int num2) {
//		int[] numbers = new int[6];
//		int index = 0;
//		
//		if(num1>=num2){
//		    return numbers;
//		}
//		
//		for(int i = num1;i<=num2;i++){
//		    if(i>9 && i<100){
//		    int sumOfDigits = (i/10) + (i%10);
//		    if(sumOfDigits%3==0 && i%5==0){
//		        if(index<6){
//		        numbers[index] = i;
//		        index++;
//		        }
//		    }
//		    }
//		}
//
//		// Implement your code here
//
//		return numbers;
//	}
//
//	public static void main(String[] args) {
//		int num1 = 10;
//		int num2 = 30;
//
//		int[] numbers = findNumbers(num1, num2);
//		if (numbers[0] == 0) {
//			System.out.println("There is no such number!");
//		} else {
//			for (int index = 0; index <= numbers.length - 1; index++) {
//				if (numbers[index] == 0) {
//					break;
//				}
//				System.out.println(numbers[index]);
//			}
//		}
//
//	}
//}
//
//class Tester {
//	public static int findTotalCount(int[] numbers) {
//		//Implement your code here and change the return value accordingly
//		int count = 0;
//		for(int i = 0;i<numbers.length - 1;i++){
//		    if(numbers[i] == numbers[i+1]){
//		        count++;
//		    }
//		}
//        return count;
//	}
//
//	public static void main(String[] args) {
//		int[] numbers = { 1, 1, 5, 100, -20, 6, 0, 0 };
//		System.out.println("Count of adjacent occurrence: "+findTotalCount(numbers));
//	}
//} 
// 
//import java.util.HashSet;
//import java.util.Set;
//
//class Tester {
//    public static String[] findPermutations(String str) {
//        // Check if the string contains capital letters
//        if (!str.equals(str.toLowerCase())) {
//            return new String[]{"N/A"};
//        }
//
//        Set<String> permutations = new HashSet<>();
//        permute(str.toCharArray(), 0, permutations);
//
//        return permutations.toArray(new String[0]); // Convert Set to Array
//    }
//
//    private static void permute(char[] chars, int index, Set<String> permutations) {
//        if (index == chars.length - 1) {
//            permutations.add(new String(chars));
//        } else {
//            for (int i = index; i < chars.length; i++) {
//                swap(chars, index, i);
//                permute(chars, index + 1, permutations);
//                swap(chars, index, i); // backtrack
//            }
//        }
//    }
//
//    private static void swap(char[] chars, int i, int j) {
//        char temp = chars[i];
//        chars[i] = chars[j];
//        chars[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        String str = "Aad";
//        String[] permutations = findPermutations(str);
//        
//        if (permutations.length == 1 && permutations[0].equals("N/A")) {
//            System.out.println("N/A");
//        } else {
//            for (String permutation : permutations) {
//                System.out.println(permutation);
//            }
//        }
//    }
//}
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//class Tester {
//    public static String[] findPermutations(String str) {
//        // Check if the string contains any capital letters
//        if (!str.equals(str.toLowerCase())) {
//            return new String[]{"N/A"};
//        }
//
//        // List to store permutations
//        List<String> permutations = new ArrayList<>();
//        permute(str.toCharArray(), 0, permutations);
//
//        // Convert List to array and return
//        return permutations.toArray(new String[0]);
//    }
//
//    private static void permute(char[] chars, int index, List<String> permutations) {
//        if (index == chars.length - 1) {
//            permutations.add(new String(chars));
//        } else {
//            for (int i = index; i < chars.length; i++) {
//                swap(chars, index, i);
//                permute(chars, index + 1, permutations);
//                swap(chars, index, i); // Backtrack
//            }
//        }
//    }
//
//    private static void swap(char[] chars, int i, int j) {
//        char temp = chars[i];
//        chars[i] = chars[j];
//        chars[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        String[] testStrings = {"abc", "aad", "Eye", "Boy"};
//
//        for (String str : testStrings) {
//            String[] permutations = findPermutations(str);
//            
//            // Print results
//            if (permutations.length == 1 && permutations[0].equals("N/A")) {
//                System.out.println("N/A");
//            } else {
//                for (String permutation : permutations) {
//                    System.out.println(permutation);
//                }
//            }
//            System.out.println(); // Print an empty line between results
//        }
//    }
//}




//class Tester{
//    public static String[] findPermutations(String str){
//        //Implement your code here and change the return value accordingly
//        String[] permutations = new String[6];
//        int index=0;
//        
//        for(int i=0; i<3; i++){
//            for(int j=0; j<3; j++){
//                if(i==j) continue;
//                for(int k=0; k<3; k++){
//                    if(k==i || k==j) continue;
//                    permutations[index++] = "" + str.charAt(i) + str.charAt(j) + str.charAt(k);
//                }
//            }
//        }
//        return permutations;
//    }
//    
//    public static void main(String args[]){
//        String str = "ada";
//        String permutations[] = findPermutations(str);
//        for(String permutation: permutations){
//            if (permutation!=null)
//                System.out.println(permutation);
//        }
//    }
//}


