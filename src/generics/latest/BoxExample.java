package generics.latest;

public class BoxExample<T> {
	
	private T val;
	
	@Override
	public String toString() {
		return "[" + val + "]";
	}
	
	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

}
