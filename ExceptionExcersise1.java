package programs;
//
//class Applicant{
//	private String name;
//	private String jobProfile;
//	private int age;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getJobProfile() {
//		return jobProfile;
//	}
//	public void setJobProfile(String jobProfile) {
//		this.jobProfile = jobProfile;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	
//}
//class InvalidAgeException extends Exception{
//	}
//}public InvalidAgeException(String message) {
//		super(message);
//	
//class InvalidJobProfileException extends Exception{
//	public InvalidJobProfileException(String message) {
//		super(message);
//	}
//}
//class InvalidNameException extends Exception{
//	public InvalidNameException(String message) {
//		super(message);
//	}
//}
//
//class Validator{
//	public boolean validateName(String name) {
//		if(name == null || name.trim().isEmpty()) return false;
//		else return true;
//	}
//	public boolean validateJobProfile(String jobProfile) {
//		if(jobProfile.equals("Associate")) return true;
//		else if(jobProfile.equals("Clerk")) return true;
//		else if(jobProfile.equals("Executive")) return true;
//		else if(jobProfile.equals("Officer")) return true;
//		else return false;
//	}
//	public boolean validateAge(int age) {
//		if(age>=18 || age<=30) return true;
//		else return false;
//	}
//	public void validate(Applicant applicant)  throws InvalidNameException,InvalidJobProfileException,InvalidAgeException{
//		if(!validateName(applicant.getName())) {
//			throw new InvalidNameException("Invaild name");
//		}
//		else if(!validateJobProfile(applicant.getJobProfile())) {
//			throw new InvalidJobProfileException("Invalid job profile");
//		}
//		else if(!validateAge(applicant.getAge())) {
//			throw new InvalidAgeException("Invalid age");
//		}
//	}
//}
//
//public class ExceptionExcersise1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        try {
//        	Applicant applicant = new Applicant();
//        	applicant.setName("Jenny");
//        	applicant.setJobProfile("Clerk");
//        	applicant.setAge(25);
//        	
//        	Validator validator = new Validator();
//        	
//        	validator.validate(applicant);
//        	System.out.println("Application submitted successfully!");
//        }
//        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
//        	System.out.println(e.getMessage());
//        }
//	}
//
//}

class Applicant {
    private String name;
    private String jobProfile;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidJobProfileException extends Exception {
    public InvalidJobProfileException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class Validator {
    public boolean validateName(String name) {
        // Check for null or empty values
        return name != null && !name.trim().isEmpty();
    }

    public boolean validateJobProfile(String jobProfile) {
        // Check if job profile is one of the accepted values
        return jobProfile.equalsIgnoreCase("Associate") || 
               jobProfile.equalsIgnoreCase("Clerk") || 
               jobProfile.equalsIgnoreCase("Executive") || 
               jobProfile.equalsIgnoreCase("Officer");
    }

    public boolean validateAge(int age) {
        // Check for age limits
        return age >= 18 && age <= 30;
    }

    public void validate(Applicant applicant) throws InvalidNameException, InvalidJobProfileException, InvalidAgeException {
        if (!validateName(applicant.getName())) {
            throw new InvalidNameException("Invalid name");
        }
        if (!validateJobProfile(applicant.getJobProfile())) {
            throw new InvalidJobProfileException("Invalid job profile");
        }
        if (!validateAge(applicant.getAge())) {
            throw new InvalidAgeException("Invalid age");
        }
    }
}

class ExceptionExcersise1 {
    public static void main(String[] args) {
        try {
            Applicant applicant = new Applicant();
            applicant.setName("Jenny"); // Change this to test different scenarios
            applicant.setJobProfile("Clerk");
            applicant.setAge(25);

            Validator validator = new Validator();
            validator.validate(applicant);
            System.out.println("Application submitted successfully!");
        } catch (InvalidNameException | InvalidJobProfileException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
