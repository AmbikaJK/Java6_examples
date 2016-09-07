package designpatterens.factroydesignpatteren;

public class FactoryShape extends AbstractFactory{
	
	@Override
	public Shape getShape (String shape) {
		if (shape == null) {
			return null;
		}
		
		// get the actual shape based on input
		if ("Circle".equalsIgnoreCase(shape)) {
			return new Circle();
		} else if ("Rectangle".equalsIgnoreCase(shape)) {
			return new Rectangle();
		} else if ("Square".equalsIgnoreCase(shape)) {
			return new Square();
		}
		
		return null;
	}
}
