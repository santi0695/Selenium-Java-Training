package week3.day1.AxisBank;

public class AxisBank {
	
	public void deposit() {
		System.out.println("The deposit method is located in Class AxisBank");
	}
	
	public static void main(String[] args) {
		
		AxisBank b = new AxisBank();
		b.deposit();
		
		//Overriding of deposit method
		BankInfo bank = new BankInfo();
		bank.deposit();
		
		
	}

}
