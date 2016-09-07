package designpatterens.newabstractfactorydesignpatterens;

public class Circle implements Shape{
	
	public Circle() {
		System.out.println("Circle craeted");
	}

	@Override
	public void fill() {
		System.out.println("Circle fill");
		
	}

	@Override
	public void draw() {
		System.out.println("Circle draw");
	}

	
	
}
