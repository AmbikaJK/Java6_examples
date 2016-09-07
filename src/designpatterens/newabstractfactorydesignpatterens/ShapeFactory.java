package designpatterens.newabstractfactorydesignpatterens;

public class ShapeFactory {

	public Shape getShape (int shapeNum) {
		switch (shapeNum) {
		case 0:
			return new Circle();
		case 1:
			return new Rectangle();
		default:
			return null;
		}
	}
}
