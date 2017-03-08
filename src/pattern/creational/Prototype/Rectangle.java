package pattern.creational.Prototype;

public class Rectangle extends Shape {
	
	public Rectangle(){
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Draw a Rectangle.");

	}

}
