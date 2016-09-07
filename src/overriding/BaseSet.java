/**
 * 
 */
package overriding;

/**
 * @author vgoyal
 *
 */
public class BaseSet {
	
	private String str;
	
	public BaseSet copy () {
		BaseSet bs = new BaseSet();
		bs.setStr("BaseSet");
		return bs;
	}
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
