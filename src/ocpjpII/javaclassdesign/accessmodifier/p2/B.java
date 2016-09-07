package ocpjpII.javaclassdesign.accessmodifier.p2;

import ocpjpII.javaclassdesign.accessmodifier.p1.*;

public class B extends A {
	
/*	public void process(A a) {
		//a.i = a.i*2; 
		
		//a.
		a.
		
	} */
	
	public static void main(String[] args) {
		A a = new A(); 
		B b = new B(); 
		b.i = 4;
		//a.
		/*
		b.process(a); 
		*///System.out.println(a.getI());
	}

}
