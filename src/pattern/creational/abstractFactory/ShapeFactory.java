package pattern.creational.abstractFactory;

public class ShapeFactory extends AbstractFactory{

	public Shape getShape(String type){
		
		if(type == null) return null;
		
		switch (type) {
			case "RECTANGLE":
				return new Rectangle();
			case "CIRCLE":
				return new Circle();
			case "SQUARE":
				return new Square();
			default:
				return null;
		}
	}

	@Override
	public Color getColor(String type) {
		return null;
	}
}
