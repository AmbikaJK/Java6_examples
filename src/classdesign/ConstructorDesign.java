package classdesign;

public class ConstructorDesign {
	
	
	private int x, y, radius;
	
	public ConstructorDesign () {
		/*x = y = 10;
		radius = 20;*/
		
		
		this.x = this.y = 10;
		this.radius = 20;
	}
	
	private ConstructorDesign (int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		/*this.x = this.y = 10;
		this.radius = 20;*/
	}
	
	@Override
	public String toString() {
		return "Circle = ( " + x + ", " + y + ") and Radius = " + radius;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorDesign constructorDesign = new ConstructorDesign(25, 25, 35);
		System.out.println(constructorDesign);
		
	}

}

