package designpatterens.factroydesignpatteren;

public class FactoryColor extends AbstractFactory{
	
	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		
		if ("Red".equalsIgnoreCase(color)) {
			return new Red();
		} else if ("Blue".equalsIgnoreCase(color)) {
			return new Blue();
		} else if ("Green".equalsIgnoreCase(color)) {
			return new Green();
		}
		return null;
	}
	
}
