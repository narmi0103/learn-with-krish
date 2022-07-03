package pizzastore;

public class CheesePizza extends Pizza {

	private String size;
	private String ingreadients;
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getIngreadients() {
		return ingreadients;
	}
	public void setIngreadients(String ingreadients) {
		this.ingreadients = ingreadients;
	}
	
	
	@Override
	public String toString() {
		return "CheesePizza [size=" + size + ", ingreadients=" + ingreadients + "]";
	}
	
	
}
