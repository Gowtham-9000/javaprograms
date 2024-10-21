package programs;
//class Faculty{
//	private String name;
//	private float basicSalary;
//	private float bonusPercentage;
//	private float carAllowancePercentage;
//	public Faculty(String name, float basicSalary) {
//		this.name = name;
//		this.basicSalary = basicSalary;
//		this.bonusPercentage = 4;
//		this.carAllowancePercentage = 2.5f;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public float getBasicSalary() {
//		return basicSalary;
//	}
//	public void setBasicSalary(float basicSalary) {
//		this.basicSalary = basicSalary;
//	}
//	public float getBonusPercentage() {
//		return bonusPercentage;
//	}
//	public void setBonusPercentage(float bonusPercentage) {
//		this.bonusPercentage = bonusPercentage;
//	}
//	public float getCarAllowancePercentage() {
//		return carAllowancePercentage;
//	}
//	public void setCarAllowancePercentage(float carAllowancePercentage) {
//		this.carAllowancePercentage = carAllowancePercentage;
//	}
//	
//	public double calculateSalary() {
//		double salary = basicSalary+basicSalary*0.04f+basicSalary*0.025f;
//		return salary;
//	}
//}
//
//class OfficeStaff extends Faculty{
//	private String designation;
//	
//	OfficeStaff(String name, float basicSalary, String designation){
//		super(name,basicSalary);
//		this.designation = designation;
//	}
//
//	public String getDesignation() {
//		return designation;
//	}
//
//	public void setDesignation(String designation) {
//		this.designation = designation;
//	}
//	public double calculateSalary() {
//		double sal = super.calculateSalary();
//		if(this.designation.equals("Accouontant")) return sal+10000.0;
//		else if(this.designation.equals("Clerk")) return sal+7000.0;
//		else if(this.designation.equals("Peon")) return sal+4500.0;
//		else return sal;
//	}
//}
//
//class Teacher extends Faculty{
//	private String qualification;
//
//	public Teacher(String name, float basicSalary, String qualification) {
//		super(name, basicSalary);
//		this.qualification = qualification;
//		// TODO Auto-generated constructor stub
//	}
//
//	public String getQualification() {
//		return qualification;
//	}
//
//	public void setQualification(String qualification) {
//		this.qualification = qualification;
//	}
//	public double calculateSlary() {
//		double sal = super.calculateSalary();
//		if(this.qualification.equals("Doctoral")) return sal+20000.0;
//		else if(this.qualification.equals("Masters")) return sal+18000.0;
//		else if(this.qualification.equals("Bachelors")) return sal+15000.0;
//		else if(this.qualification.equals("Associate")) return sal+10000.0;
//		else return sal;
//	}
//	
//	
//}
//public class MethodOverridingAssignment1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
//		OfficeStaff officeStaff = new OfficeStaff("James",24000f,"Accountant");
//		
//		System.out.println("Teacher details\n********");
//		System.out.println("Name: "+teacher.getName());
//		System.out.println("Qualification: "+teacher.getQualification());
//		System.out.println("Total salary: $"+Math.round(teacher.calculateSalary()*100)/100.0);
//		System.out.println();
//		
//		System.out.println("Office staff Details\n************");
//		System.out.println("Name: "+officeStaff.getName());
//		System.out.println("Designation: "+officeStaff.getDesignation());
//		System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary()*100)/100.0); 
//
//
//	}
//
//}

//class Faculty {
//    private String name;
//    private float basicSalary;
//    private float bonusPercentage;
//    private float carAllowancePercentage;
//
//    public Faculty(String name, float basicSalary) {
//        this.name = name;
//        this.basicSalary = basicSalary;
//    }
//
//    public double calculateSalary() {
//        return basicSalary + (basicSalary * bonusPercentage / 100) + (basicSalary * carAllowancePercentage / 100);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public float getBasicSalary() {
//        return basicSalary;
//    }
//
//    public void setBasicSalary(float basicSalary) {
//        this.basicSalary = basicSalary;
//    }
//
//    public float getBonusPercentage() {
//        return bonusPercentage;
//    }
//
//    public void setBonusPercentage(float bonusPercentage) {
//        this.bonusPercentage = bonusPercentage;
//    }
//
//    public float getCarAllowancePercentage() {
//        return carAllowancePercentage;
//    }
//
//    public void setCarAllowancePercentage(float carAllowancePercentage) {
//        this.carAllowancePercentage = carAllowancePercentage;
//    }
//}
//
//class OfficeStaff extends Faculty {
//    private String designation;
//
//    public OfficeStaff(String name, float basicSalary, String designation) {
//        super(name, basicSalary);
//        this.designation = designation;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//
//    public String getDesignation() {
//        return this.designation;
//    }
//
//    @Override
//    public float calculateSalary() {
//        float additionalPay = 0;
//        if (this.designation.equals("Accountant")) {
//            additionalPay = 10000f;
//        } else if (this.designation.equals("Clerk")) {
//            additionalPay = 7000f;
//        } else if (this.designation.equals("Peon")) {
//            additionalPay = 4500f;
//        }
//
//        return getBasicSalary() + (getBasicSalary() * getBonusPercentage() / 100) + (getBasicSalary() * getCarAllowancePercentage() / 100) + additionalPay;
//    }
//       public double calculateSalary(){
//        
//    }
//}
//
//class Teacher extends Faculty {
//    private String qualification;
//
//    public Teacher(String name, float basicSalary, String qualification) {
//        super(name, basicSalary);
//        this.qualification = qualification;
//    }
//
//    @Override
//    public float calculateSalary() {
//        float additionalPay = 0;
//        if (this.qualification.equals("Doctoral")) {
//            additionalPay = 20000f;
//        } else if (this.qualification.equals("Masters")) {
//            additionalPay = 18000f;
//        } else if (this.qualification.equals("Bachelors")) {
//            additionalPay = 15500f;
//        } else if (this.qualification.equals("Associate")) {
//            additionalPay = 10000f;
//        }
//
//        return getBasicSalary() + (getBasicSalary() * getBonusPercentage() / 100) + (getBasicSalary() * getCarAllowancePercentage() / 100) + additionalPay;
//    }
//    
//    public double calculateSalary(){
//        
//    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
//
//    public String getQualification() {
//        return this.qualification;
//    }
//}
//
//class MethodOverridingAssignment1 {
//    public static void main(String[] args) {
//        Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
//        teacher.setBonusPercentage(10f);
//        teacher.setCarAllowancePercentage(5f);
//        
//        OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");
//        officeStaff.setBonusPercentage(8f);
//        officeStaff.setCarAllowancePercentage(4f);
//
//        System.out.println("Teacher Details\n***************");
//        System.out.println("Name: " + teacher.getName());
//        System.out.println("Qualification: " + teacher.getQualification());
//        System.out.printf("Total salary: $%.2f\n", teacher.calculateSalary());
//        System.out.println();
//
//        System.out.println("Office Staff Details\n***************");
//        System.out.println("Name: " + officeStaff.getName());
//        System.out.println("Designation: " + officeStaff.getDesignation());
//        System.out.printf("Total salary: $%.2f\n", officeStaff.calculateSalary());
//
//        // Create more objects for testing your code
//    }
//}

class Faculty {
    private String name;
    private double basicSalary; // Changed to double
    private double bonusPercentage;
    private double carAllowancePercentage;

    public Faculty(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary + (basicSalary * bonusPercentage / 100) + (basicSalary * carAllowancePercentage / 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    public double getCarAllowancePercentage() {
        return carAllowancePercentage;
    }

    public void setCarAllowancePercentage(double carAllowancePercentage) {
        this.carAllowancePercentage = carAllowancePercentage;
    }
}

class OfficeStaff extends Faculty {
    private String designation;

    public OfficeStaff(String name, double basicSalary, String designation) {
        super(name, basicSalary);
        this.designation = designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return this.designation;
    }

    @Override
    public double calculateSalary() { // Changed return type to double
        double additionalPay = 0;
        switch (this.designation) {
            case "Accountant":
                additionalPay = 10000.0;
                break;
            case "Clerk":
                additionalPay = 7000.0;
                break;
            case "Peon":
                additionalPay = 4500.0;
                break;
        }

        return super.calculateSalary() + additionalPay; // Use super to avoid redundancy
    }
}

class Teacher extends Faculty {
    private String qualification;

    public Teacher(String name, double basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    @Override
    public double calculateSalary() { // Changed return type to double
        double additionalPay = 0;
        switch (this.qualification) {
            case "Doctoral":
                additionalPay = 20000.0;
                break;
            case "Masters":
                additionalPay = 18000.0;
                break;
            case "Bachelors":
                additionalPay = 15500.0;
                break;
            case "Associate":
                additionalPay = 10000.0;
                break;
        }

        return super.calculateSalary() + additionalPay; // Use super to avoid redundancy
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return this.qualification;
    }
}

class MethodOverridingAssignment1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Caroline", 30500.0, "Masters");
        teacher.setBonusPercentage(10.0);
        teacher.setCarAllowancePercentage(5.0);
        
        OfficeStaff officeStaff = new OfficeStaff("James", 24000.0, "Accountant");
        officeStaff.setBonusPercentage(8.0);
        officeStaff.setCarAllowancePercentage(4.0);

        System.out.println("Teacher Details\n***************");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Qualification: " + teacher.getQualification());
        System.out.printf("Total salary: $%.2f\n", teacher.calculateSalary());
        System.out.println();

        System.out.println("Office Staff Details\n***************");
        System.out.println("Name: " + officeStaff.getName());
        System.out.println("Designation: " + officeStaff.getDesignation());
        System.out.printf("Total salary: $%.2f\n", officeStaff.calculateSalary());
    }
}
