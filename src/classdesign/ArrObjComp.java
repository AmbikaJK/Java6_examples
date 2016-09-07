package classdesign;

public class ArrObjComp {

	int[] arr;
	
	public ArrObjComp (int[] arr) {
		this.arr = arr;
	}
	
	@Override
	public boolean equals(Object obj) {
		ArrObjComp aoc = (ArrObjComp)obj;
		for (int i=0; i < aoc.arr.length ; i++) {
			if(this.arr[i] != aoc.arr[i]) {
				return false;
			}
		}
		return true;
	}
	
	//TODO : how to override hashcode method
	@Override
	public int hashCode() {
		int hash = 5;
		return hash = hash ^ (arr.length * super.hashCode());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		ArrObjComp a1 = new ArrObjComp(arr1);
		ArrObjComp a2 = new ArrObjComp(arr1);
		
		System.out.println("a1 == a2 : " + (a1 == a2));
		System.out.println("a1.equals(a2) : " + (a1.equals(a2)));
		//System.out.println("java.util.Arrays.equals(a1, a2) : " + java.util.Arrays.equals(a1, a2));
	}

}
