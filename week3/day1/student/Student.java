package week3.day1.student;

import week3.day1.department.Department;

public class Student extends Department {

	public void studentName() {
		System.out.println("The studentName method is located in Class Student");
	}

	public void studentDept( ) {
		System.out.println("The studentDept method is located in Class Student");		
	}
	
	public void studentId( ) {
		System.out.println("The studentId method is located in Class Student");		
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
				
	}
	
}
