package day7methodoverriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		RBI rbi;
		
		//Dynamic Binding or Upcasting
		rbi = new SBI();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new HDFC();
		System.out.println(rbi.getRateOfIntrest());
		
		rbi = new ICICI();
		System.out.println(rbi.getRateOfIntrest());
	}

}
