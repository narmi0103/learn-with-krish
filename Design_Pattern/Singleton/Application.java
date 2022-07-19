package singleton;

public class Application {

	public static void main(String args[]) {
	
		 
		Printer printer = Printer.getPrinter();
		printer.print();
		
		Printer printer1 = Printer.getPrinter();
		printer1.print();
		
		
	}
}
