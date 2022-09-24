public class Main {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		int result = calculator.sum(4,8);
		int result2 = calculator.ext(12,9);
		int result3 = calculator.mul(3,14);
		int result4 = calculator.div(14,2);
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}