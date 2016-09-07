package collections.map;

import java.util.Comparator;


public class BagImplementation {
	
	public static void main(String[] args) {
		
		Bag b = new Bag(1, "black");
		Bag b1 = new Bag(1, "black");

		System.out.println(b.compareTo(b1));
		
		Comparator<Bag> c = new Comparator<Bag>() {
			@Override
			public int compare(Bag o1, Bag o2) {
				if (o1.getColor().equals(o2.getColor()))
					return 0;
				return 1;	
			}
		};
		
		System.out.println(c.compare(b, b1));
		
		/*Map<Integer, Bag> bagMap = new HashMap<Integer, Bag>();
		bagMap.put(b.getOwnerId(), b);
		//bagMap.put(b.getOwnerId(), b);
		
		System.out.println(bagMap.containsValue(b1));
		System.out.println(b.equals(b1));
		Set<Bag> bagList = new HashSet<Bag>();
		bagList.add(b);
		System.out.println(bagList.contains(b1));*/
	}
}
