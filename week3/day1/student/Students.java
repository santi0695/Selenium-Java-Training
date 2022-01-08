package week3.day1.student;

public class Students {

	public void getStudentInfo(long id) {
		System.out.println("The Student ID is "+id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("The Student ID is "+id+" and the Student Name is "+name);
	}
	
	public void getStudentInfo(String email, String phnum) {
		System.out.println("The Student Email ID is "+email+" and the Phone Number is "+phnum);
	}
	
	public static void main(String[] args) {
		
		Students s = new Students();
		s.getStudentInfo(23456);
		s.getStudentInfo(23456, "Santhosh");
		s.getStudentInfo("mrsanthosh1995@gmail.com", "9965254459");

		
	}
	
}
