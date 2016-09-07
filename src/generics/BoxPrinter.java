package generics;

public class BoxPrinter<T> {

	private T val;
	
	public BoxPrinter(T val) {
		this.val = val;
	}
	
	public T getVal() {
		return val;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
