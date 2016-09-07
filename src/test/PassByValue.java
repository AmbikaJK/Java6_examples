/**
 * 
 */
package test;

/**
 * @author vgoyal
 *
 */
public class PassByValue {
	
	private static void swap (int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("2  -- > a : " + a + ", b : " + b);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		/*System.out.println("1  -- > a : " + a + ", b : " + b);
		swap (a,b);
		System.out.println("3  -- > a : " + a + ", b : " + b);
		*/
		
		Point p = new Point();
		p.x = 10;
		p.y = 20;
		
		System.out.println("1  -- > x : " + p.x + ", y : " + p.y);
		swap2 (p);
		System.out.println("3  -- > x : " + p.x + ", y : " + p.y);
		
		Point p1 = new Point();
		p1.x = 30;
		p1.y = 40;
		
		System.out.println("1  -- > px : " + p.x + ", py : " + p.y + ", p1.x : " + p1.x + ", p1.y : " + p1.y);
		swap3 (p, p1);
		System.out.println("3  -- > px : " + p.x + ", py : " + p.y + ", p1.x : " + p1.x + ", p1.y : " + p1.y);
		
	}
	
	private static void swap3 (Point p, Point p1) {
		Point temp = p;
		p = p1;
		p1 = temp;
		System.out.println("2  -- > px : " + p.x + ", py : " + p.y + ", p1.x : " + p1.x + ", p1.y : " + p1.y);
	}
	
	private static void swap2(Point p) {
		int temp = p.x;
		p.x = p.y;
		p.y = temp;
		System.out.println("2  -- > x : " + p.x + ", y : " + p.y);
	}
}
