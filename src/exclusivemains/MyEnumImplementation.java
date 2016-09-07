/**
 * 
 */
package exclusivemains;

import enums.MyEnum;

/**
 * @author vgoyal
 * 
 */
public class MyEnumImplementation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * for (MyEnum a : MyEnum.values()) { System.out.println("" + a); //
		 * System.out.println("" + a.TWO); // System.out.println("" +
		 * a.getId()); // System.out.println("" + a.ONE.getId()); }
		 */

		for (MyEnum me : MyEnum.values()) {
			switch (me) {
			case ONE:
				System.out.println("ONE : " + MyEnum.ONE + ", valueOf : "
						+ MyEnum.valueOf("ONE") + ", inner value : "
						+ MyEnum.ONE.getId() + ", string value : "
						+ MyEnum.ONE.getStr());
				break;
			case TWO:
				System.out.println("TWO : " + MyEnum.TWO + ", valueOf : "
						+ MyEnum.valueOf("TWO") + ", inner value : "
						+ MyEnum.TWO.getStr());
				break;
			case THREE:
				System.out.println("THREE : " + MyEnum.THREE + ", valueOf : "
						+ MyEnum.valueOf("THREE") + ", inner value : "
						+ MyEnum.THREE.getId());
			default:
				break;
			}
		}

	}

}
