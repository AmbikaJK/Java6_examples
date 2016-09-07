package ocpjpII.advanceclassdesign.nestedclasses;


public class OuterStaticInner {
	
	static class Inner {
		public void print () {
			System.out.println("static Inner class");
		}
	}
	
	public static void main(String[] args) {
		OuterStaticInner.Inner inner = new OuterStaticInner.Inner();
		inner.print();
	}

}
