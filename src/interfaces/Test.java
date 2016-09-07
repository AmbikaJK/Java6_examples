package interfaces;


public class Test implements I1, I2 {

	public static void main(String[] args) throws Exception {
		
		Test t = new Test();
		I1 i1 = (I1)t;
		i1.m1();
		
		I2 i2 = (I2)t;
		i2.m1();
		
		
	}
	
	
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Hi There!!");
	}

}
