package Designer;

public class DesignerMain {
	public static void main(String args[] ) {
			
		Designer.Builder builder = new Designer.Builder("saree");
		Designer designer1 = builder.material("Cotton").quantity(12).build();
		Designer designer2 = builder.color("red").build();
		
		System.out.println(designer1);
		System.out.println(designer2);
		
	}

}
