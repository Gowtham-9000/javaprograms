package programs;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class EmployeeValidatorTest{
	@Test
	void testcalculateAnnualSalary() {
		Employee emp = new Employee("JohnDoe",30,3000);
		assertEquals(48000,emp.calculateAnnualSalary());
	}
	@Test
	void testValidateName_Invalid() {
		Validator validator = new Validator();
		Exception exception = asserThrows(InvalidNameException.class, () ->{
			validator.validateName("John");
		});
		assertEquals("Name must be greater than 8 characters.", exception.getMessage());
	}
	
	@Test
	void testValidateAge_Valid() throws InvalidAgeException{
		Validator validator = new Validator();
		assertTrue(validator.validateAge(30));
	}
	@Test
	void testValidateAge_Invalid() {
		Validator validator = new Validator();
		Exception exception = assertThrows(InvalidAgeException.class, () ->{
			validator.validate(17);
		});
		assertEquals("Age must be between 10 and 60.", exception.getMessage());
		
	}
	@Test
	void testValidateEmployee_Valid() throws InvalidNameException, InvalidAgeException{
		Validator validator = new Validator();
		Employee emp = new Employee("JaneDeoSmith",25,3500);
		validator.validate(emp);
	}
	@Test
	void testValidateEmployee_InvalidName() {
		Validator validate = new Validator();
		Employee emp = new Employee("John", 30,3000);
		assertThrows(InvalidNameException.class, ( ->{
			validator.validate(emp);
		}))
	}
}

//User-defined exceptions
class InvalidNameException extends Exception {
 public InvalidNameException(String message) {
     super(message);
 }
}

class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

//Employee class
class Employee {
 private String name;
 private int age;
 private double monthlySalary;

 // Constructor
 public Employee(String name, int age, double monthlySalary) {
     this.name = name;
     this.age = age;
     this.monthlySalary = monthlySalary;
 }

 // Getters and Setters
 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public int getAge() {
     return age;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public double getMonthlySalary() {
     return monthlySalary;
 }

 public void setMonthlySalary(double monthlySalary) {
     this.monthlySalary = monthlySalary;
 }

 // Method to calculate annual salary
 public double calculateAnnualSalary() {
     double additionalAmount = 0;
     if (age < 30) {
         additionalAmount = 1000;
     } else if (age <= 40) {
         additionalAmount = 2000;
     } else {
         additionalAmount = 3000;
     }
     return (monthlySalary + additionalAmount) * 12;
 }
}

//Validator class
class Validator {
 public boolean validateName(String name) throws InvalidNameException {
     if (name.length() > 8) {
         return true;
     } else {
         throw new InvalidNameException("Name must be greater than 8 characters.");
     }
 }

 public boolean validateAge(int age) throws InvalidAgeException {
     if (age >= 18 && age <= 60) {
         return true;
     } else {
         throw new InvalidAgeException("Age must be between 18 and 60.");
     }
 }

 public void validate(Employee employee) throws InvalidNameException, InvalidAgeException {
     validateName(employee.getName());
     validateAge(employee.getAge());
 }
}

//Tester class
public class UnitTestingCoverage {
 public static void main(String[] args) {
     Employee employee = new Employee("JohnDoe", 30, 3000);

     Validator validator = new Validator();
     try {
         validator.validate(employee);
         double annualSalary = employee.calculateAnnualSalary();
         System.out.println("Annual Salary: " + annualSalary);
     } catch (InvalidNameException | InvalidAgeException e) {
         System.out.println(e.getMessage());
     }
 }
}

