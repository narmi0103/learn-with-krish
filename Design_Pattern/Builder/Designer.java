package Designer;

public class Designer {
	private final String type;
	private final String material;
	private final String color;
	private final int quantity;
	

	public Designer(Builder builder){
		this.type =builder.type;
		this.material =builder. material;
		this.color =builder.color;
		this.quantity =builder.quantity;
		
	}
	
	
	
	static class Builder{
		private String type;
		private String material;
		private String color;
		private int quantity;
		
		public Designer build() {
			return new Designer(this);
		}
		
		public Builder(String type) {
			this.type =type;
			
		}
		
		public Builder material(String material) {
			this.material = material;
			return this;
			
		}
		
		public Builder color(String color) {
			this.color = color;
			return this;
			
		}
		
		public Builder quantity(int quantity) {
			this.quantity = quantity;
			return this;
			
		}
	}



	@Override
	public String toString() {
		return "Designer [type=" + type + ", material=" + material + ", color=" + color + ", quantity=" + quantity
				+ "]";
	}
	
	

}
