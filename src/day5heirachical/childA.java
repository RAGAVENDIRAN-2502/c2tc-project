package day5heirachical;

public class childA extends parent {

	void name() {
		System.out.println("Child A name");
	}

	public static void main(String[] args) {
		childA a = new childA();
		a.name();
		a.address();
		a.phno();
	}

}
