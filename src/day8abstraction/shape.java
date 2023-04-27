package day8abstraction;

public abstract class shape {

	
		protected float area;
		
		//abstract method
		abstract void calArea();
		
		//normal method
		void show() {
			System.out.println("Area of shape is "+area);
	}

}
