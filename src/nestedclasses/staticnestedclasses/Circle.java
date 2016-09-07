package nestedclasses.staticnestedclasses;

public class Circle {
	
	Point point;
	int radius;
	
	public Circle() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	public Circle(int xPos, int yPos, int r) {
		point = this.new Point(xPos, yPos);
		this.radius = r;
	}
	
	class Point {
		int xPos;
		int yPos;
		
		Point (int x, int y) {
			this.xPos = x;
			this.yPos = y;
		}
		
		@Override
		public String toString() {
			return "Points --> xPos : " + xPos + ", yPos : " + yPos;
		}
	}
	
	/*public String getInnerLocalClassMethod () {
		
	}*/
	
	@Override
	public String toString() {
		return "radius : " + radius + "; "+ point;
	}
}


