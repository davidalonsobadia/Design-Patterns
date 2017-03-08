package pattern.creational.abstractFactory;

public class ColorFactory extends AbstractFactory{

	public Color getColor(String type){
		
		if(type == null) return null;
		
		switch (type) {
			case "BLUE":
				return new Blue();
			case "GREEN":
				return new Green();
			case "RED":
				return new Red();
			default:
				return null;
		}
	}

	@Override
	public Shape getShape(String type) {
		return null;
	}
}