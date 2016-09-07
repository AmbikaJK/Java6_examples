package ocpjpII.javaclassdesign.equalsandhashcode;

import java.util.HashSet;

public class Test {
	public static void main(String[] args) {
		
		Employee e = new Employee();
		Employee e1 = new Employee();
		e.setId(1);
		e1.setId(1);
		System.out.println(e.equals(e1));
		
		HashSet<Employee> hs = new HashSet<Employee>();
		hs.add(e);
		hs.add(e1);
		System.out.println(hs);
	}
}
