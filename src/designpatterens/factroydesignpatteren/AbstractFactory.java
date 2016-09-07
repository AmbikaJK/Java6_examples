package designpatterens.factroydesignpatteren;

public class AbstractFactory {
	public Shape getShape(String Shape) {
		return null;
	}
	
	public Color getColor(String color) {
		return null;
	}
	
	public AbstractFactory getAbstractFactory (String factory) {
		if (factory == null) {
			return null;
		}
		
		if ("Shape".equalsIgnoreCase(factory)) {
			return new FactoryShape();
		} else if ("Color".equalsIgnoreCase(factory)) {
			return new FactoryColor();
		}
		return null;
	}
}
