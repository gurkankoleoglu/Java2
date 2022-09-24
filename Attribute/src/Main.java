public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1, "Laptop", "ASUS laptop", 5000, 3);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}
}