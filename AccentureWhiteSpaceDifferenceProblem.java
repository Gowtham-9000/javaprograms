package programs;

//import java.util.Scanner;

//public class AccentureWhiteSpaceDifferenceProblem {
//
//
//
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        // Input two strings A and B
//	        System.out.println("Enter string A:");
//	        String stringA = scanner.nextLine();
//	        System.out.println("Enter string B:");
//	        String stringB = scanner.nextLine();
//
//	        // Get the result
//	        String result = getWhitespaceDifference(stringA, stringB);
//	        System.out.println(result);
//	    }
//
//	    public static String getWhitespaceDifference(String strA, String strB) {
//	        // Count spaces in each string
//	        int spacesA = countSpaces(strA);
//	        int spacesB = countSpaces(strB);
//
//	        // Calculate the difference in spaces
//	        int difference = Math.abs(spacesA - spacesB);
//
//	        // Determine if the difference is even or odd
//	        if (difference % 2 == 0) {
//	            return "Even" + difference;
//	        } else {
//	            return "Odd" + difference;
//	        }
//	    }
//
//	    private static int countSpaces(String str) {
//	        int count = 0;
//	        for (char c : str.toCharArray()) {
//	            if (c == ' ') {
//	                count++;
//	            }
//	        }
//	        return count;
//	    }
//}

public class  AccentureWhiteSpaceDifferenceProblem {
    public static void main(String[] args) {
        String A = "He ll o Wo rl d";
        String B = "Hello World";
        System.out.println(whitespaceDifference(A, B));
    }

    public static String whitespaceDifference(String A, String B) {
        int whitespace_A = countWhitespaces(A);
        int whitespace_B = countWhitespaces(B);
        int difference = Math.abs(whitespace_A - whitespace_B);

        String status = (difference % 2 == 0) ? "Even" : "Odd";

        return status + difference;
    }

    public static int countWhitespaces(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                count++;
            }
        }
        return count;
    }
}
