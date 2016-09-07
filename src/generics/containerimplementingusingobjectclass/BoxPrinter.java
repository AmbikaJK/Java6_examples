package generics.containerimplementingusingobjectclass;

public class BoxPrinter {

	private Object val;
	
	public BoxPrinter(Object val) {
		this.val = val;
	}
	
	@Override
	public String toString() {
		return "[" + val + "]";
	}
	
	
}
