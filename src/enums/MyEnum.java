/**
 * 
 */
package enums;

/**
 * @author vgoyal
 *
 */
public enum MyEnum {
	
	ONE(1), TWO(2, 1), THREE("Third");
	
	private int id;
	private String str;
	private int id1;
	
	private MyEnum(int id) {
		this.id = id;
	}
	
	private MyEnum(String str){
		this.str = str;
	}
	
	private MyEnum(int id, int id1) {
		this.id = id;
		this.id1 = id1;
	}
	
	private MyEnum(int id, String str) {
		this.id = id;
		this.str = str;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getId1() {
		return this.id1;
	}
	
	public String getStr () {
		return this.str;
	}
	

}
