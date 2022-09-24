public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		String message = "Maturity rate";

		Product product1 = new Product();
		product1.setName("Delogni coffee machine");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Smeg coffee machine");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image1.jpg");

		Product[] products = {product1, product2};

		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "<li>");
		}
		System.out.println("<ul>");

		IndividualCustomers individualCustomer = new IndividualCustomers();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Gurkan");
		individualCustomer.setLastName("Koleoglu");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyNames("Coding.io");
		corporateCustomer.setPhone("05222222222");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		@SuppressWarnings("unused")
		Customer[] customers = {individualCustomer, corporateCustomer};

	}
}