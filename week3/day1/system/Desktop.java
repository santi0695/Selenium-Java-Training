package week3.day1.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("Desktop Size method is located in Class named Desktop");
	}
	
	
	public static void main(String[] args) {
		
		Desktop dell = new Desktop();
		dell.computerModel();
		dell.desktopSize();
		
	}
	
}
