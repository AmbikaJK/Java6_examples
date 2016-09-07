/**
 * 
 */
package overriding;

/**
 * @author vgoyal
 *
 */
public class Point {

	int xPos, yPos;
	
	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		try {
			if (obj == null) {
				return false;
			}
			
			if (obj instanceof Point) {
				Point p = (Point) obj;
				if (p.xPos == this.xPos && p.yPos == this.yPos) {
					return true;
				}
			}
			return false;
		} catch (Exception ex) {
			System.out.println("Exception : " + ex.getMessage());
			return false;
		}
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(100,220);
		Point p3 = new Point(10,20);
		
		System.out.println("p1 equals p2 : " + p1.equals(p2));
		System.out.println("p1 equals p3 : " + p1.equals(p3));
		
		Object p1Obj = new Point(10,20);
		Object p2Obj = new Point(100,220);
		Object p3Obj = new Point(10,20);
		
		System.out.println("p1 equals p2 : " + p1Obj.equals(p2Obj));
		System.out.println("p1 equals p3 : " + p1Obj.equals(p3Obj));
		
		/*p3Obj = p1Obj;
		System.out.println("p1 equals p2 : " + p1Obj.equals(p2Obj));
		System.out.println("p1 equals p3 : " + p1Obj.equals(p3Obj));*/
		
	}

}
