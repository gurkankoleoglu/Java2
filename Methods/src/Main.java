public class Main {

	public static void findTheNumber() {
		
		int[] numbers = {1, 2, 5, 7, 9, 0};
		int target = 6;
		boolean isThere = false;
		
		for(int num : numbers) {
			if(num == target) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("Number is in there.");
		} else {
			System.out.println("Number is not in there.");
		}
	}
	
	public static void main(String[] args) {
		findTheNumber();
	}
}