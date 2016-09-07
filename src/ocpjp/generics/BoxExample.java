package ocpjp.generics;

public class BoxExample<T1, T2> {
	
	T1 val;
	T2 val2;
	
	public T1 getVal() {
		return val;
	}

	public void setVal(T1 val) {
		this.val = val;
	}

	public T2 getVal2() {
		return val2;
	}

	public void setVal2(T2 val2) {
		this.val2 = val2;
	}

	@Override
	public String toString() {
		return "[" + val +", " + val2 + "]";
	}
	
	
}
