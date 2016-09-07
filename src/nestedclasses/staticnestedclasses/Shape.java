package nestedclasses.staticnestedclasses;

import designpatterens.factroydesignpatteren.Color;

public class Shape {
	static class color {
		int r_col, g_col, b_col;
		
		public color() {
			this(0,0,0);
		}
		
		public color (int r_col,int g_col,int b_col) {
			this.r_col = r_col;
			this.g_col = g_col;
			this.b_col = b_col;
		}
		
		@Override
		public String toString() {
			return "colors are : (red = " + r_col + ", green = " + g_col + ", blue = " + b_col + ")";
		}
	}
}
