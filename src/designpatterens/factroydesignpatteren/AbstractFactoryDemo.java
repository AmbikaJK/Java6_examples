package designpatterens.factroydesignpatteren;

public class AbstractFactoryDemo {
	public static void main(String[] args) {
		AbstractFactory abstractFactory = new AbstractFactory();
		//get Factory
		AbstractFactory abFactory = abstractFactory.getAbstractFactory("shape");
		
		//get Shape
		Shape shape = abFactory.getShape("Circle");
		shape.getShape();
		
		//get Factory
		AbstractFactory abstractFactory2 = abstractFactory.getAbstractFactory("color");
		//get color
		Color color = abstractFactory2.getColor("Red");
		color.fill();
	}
}
