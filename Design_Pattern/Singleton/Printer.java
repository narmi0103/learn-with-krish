package singleton;

public class Printer {
	
	private static volatile Printer printer;

	private Printer() {
		if(printer != null) {
			throw new RuntimeException("please use detPrinter method");
			
		}
	}
	
	 public void print() {
	        System.out.println("Print!!!!!!");
	    }

	public static Printer getPrinter() {
		
		if(printer == null) {
			
			synchronized (Printer.class) {
				if(printer == null ) {
					
					printer = new Printer();
					
				}
			
			
			}
		}
			
		return printer;
	}


	
	

}


