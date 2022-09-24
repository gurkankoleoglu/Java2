public class Main {

	public static void main(String[] args) {
	
		LoanUI lui = new LoanUI();
		lui.calculateTheLoan(new SoldierLoanManager());
	}
}