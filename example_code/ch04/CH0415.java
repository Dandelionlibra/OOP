package ch04;

public class CH0415 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		 int i, j;   // 變數宣告
	        // 巢狀迴圈
	     for ( i = 1; i <= 9; i++ ) { // 第一層遐圈
	         j = 1;
	         while ( j <= 9 ) {       // 第二層迴圈
	             System.out.print(i + "*" + j + "=" + i*j + " ");
	             j++;
	         }
	         System.out.print("\n");
	     }
	}
}
