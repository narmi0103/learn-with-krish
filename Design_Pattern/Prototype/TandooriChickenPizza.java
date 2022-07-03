package pizzastore;

public class TandooriChickenPizza extends Pizza {

	
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
		return "TandooriChickenPizza [size=" + size + ", ingreadients=" + ingreadients + "]";
	}
	
	
	
}
