package myjava.enums;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetDemo {

	private enum Color { 
		RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);
		
		private int r; 
		private int g; 
		private int b; 
		
		private Color(int r, int g, int b) { 
			this.r = r; 
			this.g = g; 
			this.b = b; 
		} 
		
		@SuppressWarnings("unused")
		public int getR() { return r; }
		@SuppressWarnings("unused")
		public int getG() { return g; }
		@SuppressWarnings("unused")
		public int getB() { return b; } 
	}
	
	public static void main(String... args) { 
		// RED + GREEN = YELLOW 
		EnumSet<Color> yellow = EnumSet.of(Color.RED, Color.GREEN); 
		drawLine(yellow); 
		
		// RED + GREEN + BLUE = WHITE 		
		EnumSet<Color> white = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE); 
		drawLine(white); 
		
		// RED + BLUE = PINK		
		EnumSet<Color> pink = EnumSet.of(Color.RED, Color.BLUE);
		drawLine(pink); 
	}

	public static void drawLine(Set<Color> colors) { 
		System.out.println("Requested Colors to draw lines : " + colors);
		
		for (Color c : colors) { 
			System.out.println("drawing line in color : " + c); 
		}
	}
}
