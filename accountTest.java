package Classes;

public class accountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		savingsAccount sa1 = new savingsAccount();
		
		sa1.name = "Ivan";
		sa1.balance = 56.89;
		
		System.out.println("Name:" + sa1.name);
		
		sa1.withdraw(5.5);
		System.out.println("Balance:" + sa1.balance);
		
		sa1.deposit(25.5);
		System.out.println("Balance:" + sa1.balance);
		
		
		sa1.withdraw(2235.5);
		sa1.withdraw(-2235.5);
		sa1.deposit(-2235.5);
	}

}