package day8Interface;

public class BankDemo {

	public static void main(String[] args) {
		SavingAccount sa = new SavingAccount("Ragava", "Chennai", 9025, 55000);
		System.out.println(sa);
		
		sa.deposit(23000);
		System.out.println(sa);
		
		sa.withdraw(15000);
		System.out.println(sa);
		
		sa.deposit(26000);
		System.out.println(sa);
	}

}
