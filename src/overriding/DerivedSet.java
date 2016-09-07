package overriding;

public class DerivedSet extends BaseSet{
	
	private String str;
	
	@Override
	public DerivedSet copy() {
		DerivedSet ds = new DerivedSet();
		ds.setStr("derived set");
		return ds;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	

}
