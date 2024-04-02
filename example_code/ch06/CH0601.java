package ch06;

public class CH0601 {

	public static void main(String[] args) {

		drawTriangle();
	}
	private static void drawTriangle() {
		   int i, j;
		   for ( i = 1; i <= 5; i++ ) {
		      for ( j = 1; j <= i; j++ )
		         System.out.print("*");
		      System.out.print("\n");
		   }
	}
}
