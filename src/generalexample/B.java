package generalexample;

public class B extends A{

	public void m1() {
		System.out.println("B");
	}
	
	
	public static void main(String[] args) {
		
		try{
			
		} finally{
			
		}
		
		A a = new A();
		B b = new B();
		
		A r;
		r = a;
		r.m1();
		
		r = b;
		r.m1();
		
		
		
		
		
	}
}
