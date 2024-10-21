package programs;

//public class Tester {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		        String str = "ada";
//		        String permutations[] = findPermutations(str);
//		        for(String permutation: permutations){
//		            if (permutation!=null)
//		                System.out.println(permutation);
//		        }
//		    }
//		    public static String[] findPermutations(String str){
//		        //Implement your code here and change the return value accordingly
//		    	
//		        String[] permutations = new String[6];
//		        int index=0;
//		        
//		        for(int i=0; i<3; i++){
//		            for(int j=0; j<3; j++){
//		                if(i==j) continue;
//		                for(int k=0; k<3; k++){
//		                    if(i==k || j==k) continue;
//		                    permutations[index++] = "" + str.charAt(i) + str.charAt(j) + str.charAt(k);
//
//		                }
//		            }
//		        }
//		        return permutations;
//		    }
//		    
//
//
//}

//import java.util.HashSet;
//import java.util.Set;
//
//class Tester {
//    public static String[] findPermutations(String str) {
//        Set<String> permutations = new HashSet<>();
//        generatePermutations("", str, permutations);
//        return permutations.toArray(new String[0]);
//    }
//
//    private static void generatePermutations(String prefix, String str, Set<String> permutations) {
//        int n = str.length();
//        if (n == 0) {
//            permutations.add(prefix);
//        } else {
//            for (int i = 0; i < n; i++) {
//                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), permutations);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        String str = "Abc";
//        String[] permutations = findPermutations(str);
//        for (String permutation : permutations) {
//            if (permutation != null)
//                System.out.println(permutation);
//        }
//    }
//}

import java.util.HashSet;
import java.util.Set;

class Tester {
    public static String[] findPermutations(String str) {
        // Check if the string contains any uppercase letters
        if (!str.equals(str.toLowerCase())) {
           return new String[] {"N/A"};
        }else {
        
        Set<String> permutations = new HashSet<>();
        generatePermutations("", str, permutations);
        return permutations.toArray(new String[0]);
        }
    }

    private static void generatePermutations(String prefix, String str, Set<String> permutations) {
        int n = str.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                // Generate permutations by excluding the character at index `i`
                generatePermutations(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), permutations);
            }
        }
    }

    public static void main(String[] args) {
        String str = "aad";
        String[] permutations = findPermutations(str);
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }
}


