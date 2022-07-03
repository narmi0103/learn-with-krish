package pizzastore;

public class PizzaStore {
	
	public static void main(String args[]) {
		Registry registry = new Registry();
		
		CheesePizza cheesepizza = (CheesePizza) registry.getPizza("CHEESE");
		System.out.println(cheesepizza);
		
		cheesepizza.setSize("Large"); // change Size of Cheese Pizza
		cheesepizza.setIngreadients(" Extra mozzarella cheese, bocconcini ball,Chicken, Con , vegetable ,tomato sauce");
		
		System.out.println(cheesepizza);// Printing after Size is set new value
		

		CheesePizza cheesepizza1 = (CheesePizza) registry.getPizza("CHEESE"); 
		System.out.println(cheesepizza1); // 
	}
	

}
