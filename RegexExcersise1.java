package programs;

class RegexExcersise1 {

    public static boolean checkNameValidity(String name) {
        //Implement your code here and change the return value accordingly
    	String regex = "^[A-Z][a-zA-Z]{1,11}(\\s[A-Z][a-zA-Z]{1,8}){0,2}$";
        if(name.matches(regex)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        //Change the value of name for testing your code with different names
        String name = "roger federer";
        System.out.println("The name is "+ (checkNameValidity(name) ? "valid!" : "invalid!"));      
    }
}

