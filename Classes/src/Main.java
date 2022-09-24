public class Main {

	public static void main(String[] args) {

		CustomerManager cm = new CustomerManager();
		CustomerManager cm2 = new CustomerManager();
		cm = cm2;
		
		cm.add();
		cm.delete();
		cm.update();
		
		int num1 = 10, num2 = 20;
		num2 = num1;
		num1 = 30;
		System.out.println(num2);
	}
}