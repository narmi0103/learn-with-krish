package pizzastore;
import java.util.HashMap;
import java.util.Map;

public class Registry {
	
	private Map<String, Pizza> pizzas = new HashMap<>();
	
	public Registry() {
		this.initialize();
		
	}
	public Pizza getPizza(String pizzaType) {
		Pizza pizza= null;
		try {
			 
			pizza =(Pizza) pizzas.get(pizzaType).clone();
			
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
			}
		return pizza;
	}
private void initialize(){
		CheesePizza cheesepizza = new CheesePizza();
		cheesepizza.setName("Double Cheese Margherita");
		cheesepizza.setSize("Medium");
		cheesepizza.setIngreadients("mozzarella cheese, bocconcini ball, charry tomotoes, tomato sauce");
		pizzas.put("CHEESE", cheesepizza);
		
		VeggiPizza veggipizza = new VeggiPizza();
		veggipizza.setName("Veg Extravaganza");
		veggipizza.setSize("Large");
		veggipizza.setIngreadients("black olives, capsicum, onion, grilled, mushroom, corn,tomoto,jalapeno");
		pizzas.put("VEGGI", cheesepizza);
	}

}
