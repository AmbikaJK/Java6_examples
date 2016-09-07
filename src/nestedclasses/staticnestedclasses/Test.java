package nestedclasses.staticnestedclasses;

public class Test {

	public static void main(String[] args) {

		/*
		 * Local Inner Class
		 */
		Shape.color white = new Shape.color(255,255,255);
		Test t = new Test();
		Shape.color s = t.shapeReporter(white);
		System.out.println(s);
		Shape.color s1 = t.shapeReporter1(new Shape.color());
		System.out.println(s1);
		
		
	}
	
	 private Shape.color shapeReporter (final Shape.color sc) {
		 class Descriptor extends Shape.color {
			@Override
			public String toString() {
				return "Local Inner Class :  " + sc.toString();
			}
		 }
		 return new Descriptor();
	 }

	 
	 private Shape.color shapeReporter1 (final Shape.color sc) {
		return new Shape.color() {
			@Override
			public String toString() {
				return "Local Inner Class :  " + sc.toString();
			}
		 };
	 }
	 
}
