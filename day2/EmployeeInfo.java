package week1.day2;

public class EmployeeInfo {

	
	public void getEmployeeDetails(String empName, int empId) {
		System.out.println("Details of"+empName+""+empId);
	}
	
	public void getCompanyAddress() {
		System.out.println("The company address is Chennai");
	}
	
	public int getPincode() {
		System.out.println("The Pincode is");
		return 624004;
	}
	
	public static void main (String[] args) {
		
		EmployeeInfo ei = new EmployeeInfo();
		
		ei.getEmployeeDetails("Santhosh", 563479);
		ei.getCompanyAddress();
		ei.getPincode();
	}
	
}
