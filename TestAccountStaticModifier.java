package Classes;

public class TestAccountStaticModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Напишете тестова програма, която създава обект Account с id на акаунтa 1122 ,
		 * салдо от 20 000 долара и годишен лихвен процент от 4,5%. Използвайте метода
		 * за изтегляне за да изтеглите $ 2500, използвайте метода за депозит, за да
		 * депозирате $ 3000 и отпечатайте баланса по сметката, месечната лихва и
		 * датата, когато е създаден този акаунт.
		 */
		AccountStaticModifier a = new AccountStaticModifier(1122,20_000);
		AccountStaticModifier.setYearInterestRate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		
		System.out.println("Balance: " + a.getBalance() +
				" Monthly interest rate: " + AccountStaticModifier.getMonthlyInterestRate()
				+ " Monthly interest: " + a.getMonthlyInterest()
				+ " Date created: " + a.getDateCreated());

	}

}
