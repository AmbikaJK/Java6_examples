package ocpjpII.javaclassdesign.overidingandoverloading.overloading;

public class OverloadingTest {

	//void probe(int x) { System.out.println("Int" + x); } //0
	void probe(int... x) { System.out.println("In ..." + x); }//1         
	//void probe(Integer x) { System.out.println("In Integer"); } //2          
	//void probe(long x) { System.out.println("In long"); }//3          
	void probe(Long x) { System.out.println("In LONG"); } //4          
	
	public static void main(String[] args){ 
		Integer a = 4; new OverloadingTest().probe(a); //5      //Integer // int // long /// int... // Never on Long object    
		int b = 4; new OverloadingTest().probe(b); //6         // int // Integer // long // int... // Never on Long object    
	}
	
}
