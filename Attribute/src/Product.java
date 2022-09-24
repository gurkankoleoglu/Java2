public class Product {
	
	public Product(int Id, String name, String description, double price, int stockAmount) {		// Constructor block
		System.out.println("Constructor method.");
		this.Id = Id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}
	
	public Product() {
		
	}
	
	private int Id, stockAmount;
	private String name, description;
	private double price;
	
	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return Id;
	}
	
	public void setId(int Id) {
		this.Id = Id;
	}
}