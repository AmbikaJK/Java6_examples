package inheritance;

import obj.BaseSet;
import obj.DerivedSet;

public class BaseClassStaticMethod {

	/**
	 * @param args
	 */
	
	/*
	 * dynamic loading happens with only virtual methods not with static
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		BaseSet bs = new DerivedSet();
		bs.foo(bs);
	}

}
