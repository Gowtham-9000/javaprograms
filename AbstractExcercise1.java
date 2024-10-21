package programs;

//abstract class Student{
//	private String studentName;
//	private int[] testScores = new int[4];
//	private String testResults;
//	public Student(String studentName) {
//		this.studentName = studentName;
//	}
//	public abstract void generateResult() ;
//	public String getStudentName() {
//		return studentName;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//	public int[] getTestScores() {
//		return testScores;
//	}
//	public void setTestScores(int testNumber, int testScore) {
//		this.testScores[testNumber] = testScore;
//	}
//	public String getTestResults() {
//		return testResults;
//	}
//	public void setTestResults(String testResults) {
//		this.testResults = testResults;
//	}	
//}
//
//class UndergraduateStudent extends Student{
//	public UndergraduateStudent(String studentName) {
//		super(studentName);
//	}
//	public void generateResult() {
//		int[] testScores = new int[4];
//		int sum=0,avg;
//		testScores = getTestScores();
//		for(int i=0;i<testScores.length;i++) {
//			sum = sum+testScores[i];
//		}
//		avg = sum/testScores.length;
//		if(avg>=60) setTestResult("Pass");
//		else setTestResult("Fail");
//	}
//}
//
//class GraduateStudent extends Student{
//	public GraduateStudent(String studentName) {
//		super(studentName);
//	}
//	public void generateResult() {
//		int[] testScores = new int[4];
//		int sum=0,avg;
//		testScores = getTestScores();
//		for(int i=0; i<testScores.length;i++) {
//			sum = sum+testScores[i];
//		}
//		avg = sum/testScores.length;
//		if(avg>=70) setTestResult("Pass");
//		else setTestResult("Fail");
//	}
//}
//
//public class AbstractExcercise1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		UnderGraduateStudent underGraduateStudent = new UnderGraduateStudent("Philip");
//		underGraduateStudent.setTestScores(0,70);
//		underGraduateStudent.setTestScores(1,69);
//		underGraduateStudent.setTestScores(2,71);
//		underGraduateStudent.setTestScores(3,55);
//		
//		underGraduateStudent.generateResult();
//		
//		 System.out.println("Student name: "+underGraduateStudent.getStudentName());
//	        System.out.println("Result: "+underGraduateStudent.getTestResults());
//	            
//	        System.out.println();
//	            
//	        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
//	        graduateStudent.setTestScores(0, 70);
//	        graduateStudent.setTestScores(1, 69);
//	        graduateStudent.setTestScores(2, 71);
//	        graduateStudent.setTestScores(3, 55);
//	            
//	        graduateStudent.generateResult();
//	            
//	        System.out.println("Student name: "+graduateStudent.getStudentName());
//	        System.out.println("Result : "+graduateStudent.getTestResults());
//		
//		
//		
//
//	}
//
//}

//abstract class Student{
//	private String studentName;
//	private int[] testScores;
//	private String testResult;
//	Student(String studentName){
//		this.studentName = studentName;
//		this.testScores = new int[4];
//	}
//	public abstract void generateResult() ;
//	public String getStudentName() {
//		return studentName;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//	public int[] getTestScores() {
//		return testScores;
//	}
//	public void setTestScore(int testNumber, int testScore) {
//		this.testScores[testNumber] = testScore;
//	}
//	public String getTestResult() {
//		return testResult;
//	}
//	public void setTestResult(String testResult) {
//		this.testResult = testResult;
//	}
//	
//	
//}

//class UndergraduateStudent extends Student{
//	UndergraduateStudent(String studentName){
//		super(studentName);
//	}
//	public void generateResult() {
//		int[] testScores = new int[4];
//		int sum=0,avg;
//		for(int i=0;i<testScores.length;i++) {
//			sum = sum+testScores[i];
//		}
//		avg = sum/testScores.length;
//		if(avg>=60) setTestResult("Pass");
//		else setTestResult("Fail");
//	}
//}
//
//class GraduateStudent extends Student{
//	GraduateStudent(String studentName){
//		super(studentName);
//	}
//	public void generateResult() {
//		int[] testScores = new int[4];
//		int sum=0,avg;
//		for(int i=0;i<testScores.length;i++) {
//			sum = sum+testScores[i];
//		}
//		avg = sum/testScores.length;
//		if(avg>=70) {
//			setTestResult("Pass");
//		}
//		else {
//			setTestResult("Fail");
//		}
//	}
//}

abstract class Student{
    //Implement your code here
    private String studentName;
	private int[] testScores;
	private String testResult;
	public Student(String studentName){
		this.studentName = studentName;
		this.testScores = new int[4];
	}
	public abstract void generateResult() ;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int[] getTestScores() {
		return testScores;
	}
	public void setTestScore(int testNumber, int testScore) {
		this.testScores[testNumber] = testScore;
	}
	public String getTestResult() {
		return testResult;
	}
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
}

class UndergraduateStudent extends Student{
	public UndergraduateStudent(String studentName) {
		super(studentName);
	}
	public void generateResult() {
		int[] testScores = new int[4];
		int sum=0,avg;
		testScores = getTestScores();
		for(int i=0;i<testScores.length;i++) {
			sum = sum+testScores[i];
		}
		avg = sum/testScores.length;
		if(avg>=60) setTestResult("Pass");
		else setTestResult("Fail");
	}
}

class GraduateStudent extends Student{
	public GraduateStudent(String studentName) {
		super(studentName);
	}
	public void generateResult() {
		int[] testScores = new int[4];
		int sum=0,avg;
		testScores = getTestScores();
		for(int i=0; i<testScores.length;i++) {
			sum = sum+testScores[i];
		}
		avg = sum/testScores.length;
		if(avg>=70) setTestResult("Pass");
		else setTestResult("Fail");
	}
}

class  AbstractExcercise1{

    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }
}
