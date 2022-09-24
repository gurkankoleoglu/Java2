public class Main {

	public static void main(String[] args) {

		String message = "This weather is nice.";
		String newMessage = message.substring(0,2);
		System.out.println(newMessage);
		int num = sum(5,7);
		System.out.println(num);
		int num2 = sum2(7,6,9,5,4,1);
		System.out.println(num2);
	}
	
	public static void add() {
		System.out.println("Added.");
	}
	
	public static void delete() {
		System.out.println("Deleted.");
	}
	
	public static void upgrade() {
		System.out.println("Upgraded.");
	}
	
	public static int sum(int num1,int num2) {
		return num1 + num2;
	}
	
	public static int sum2(int... numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
}