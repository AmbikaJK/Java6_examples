package overriding;

import java.util.Collection;

public class B extends A {
	
	@Override
	public void m1(Collection<String> c) throws NullPointerException {
		// TODO Auto-generated method stub
		//super.m1(c);
	}

}
