package collections.map;

public class Bag implements Comparable<Bag> {
	
	private int OwnerId;
	private String capacity;
	private String color;
	private int zips;
	private String company;
	private Integer l;
	
	public Bag(int id, String color) {
		this.OwnerId = id;
		this.color = color;
		
		System.out.println(this.hashCode());
	}
	
	public Integer getL() {
		return l;
	}

	public void setL(Integer l) {
		this.l = l;
	}

	public int getOwnerId() {
		return OwnerId;
	}
	public void setOwnerId(int ownerId) {
		OwnerId = ownerId;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getZips() {
		return zips;
	}
	public void setZips(int zips) {
		this.zips = zips;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		
		if (obj instanceof Bag)
			if (this.OwnerId == ((Bag)obj).OwnerId)
				return true;
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return 7 * this.OwnerId;
	}

	@Override
	public int compareTo(Bag o) {
		if (this.OwnerId == o.OwnerId)
			return 0;
		return 1;
	}
	
	
	
}
