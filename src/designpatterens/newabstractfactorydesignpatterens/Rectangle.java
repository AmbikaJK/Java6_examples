package designpatterens.newabstractfactorydesignpatterens;

public class Rectangle implements Shape{

	public Rectangle() {
		System.out.println("Rectangle Created");
	}
	
	
	@Override
	public void fill() {
		System.out.println("Rectangle fill");
		
	}

	@Override
	public void draw() {
		System.out.println("Rectangle draw");
	}

	
	
}
