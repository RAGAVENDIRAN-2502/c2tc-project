package day8abstraction;

public class Square extends shape {

	float side;

	public Square() {
		side = 2.0f;
	}
	public Square(float side) {
		this.side = side;
	}
	@Override
	void calArea() {
		super.area = side*side;
	}

}
