package overriding;

import java.util.Collection;

public class A {
	
	static final String s;
	
	/*static {
		s = "";
	}*/
	
	public void m1(Collection<String> c) throws Exception {
		System.out.println(1);
	}
	
	/*public void m1(List<String> l) {
		System.out.println(2);
	}
	
	public void m1(ArrayList<String> al) {
		System.out.println(3);
	}
	
	public void m1(int i) {
		System.out.println(4);
	}
	
	public void m1(Integer i) {
		System.out.println(5);
	}

	public void m1(Double i) {
		System.out.println(6);
	}
*/	
	/*public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("a");
		A a = new A();
		Integer aa = 1;
		a.m1(1);
		a.m1(aa);
		a.m1(al);
		//a.m1(null);
	}*/
}
