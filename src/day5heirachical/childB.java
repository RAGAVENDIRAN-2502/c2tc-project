package day5heirachical;

public class childB extends parent {
	void name() {
		System.out.println("Child B name");
	}
	public static void main(String[] args) {
		childB b = new childB();
		b.name();
		b.address();
		b.phno();
	
	}

}
