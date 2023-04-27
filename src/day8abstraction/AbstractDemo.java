package day8abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Square s = new Square();
		s.calArea();
		s.show();
		
		shape shape;
		shape = new Square(21.5f);
		
		shape.calArea();
		shape.show();
	}

}
