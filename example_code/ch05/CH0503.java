package ch05;

public class CH0503 {

	public static void main(String[] args) {
		// 宣告二維陣列array[9][9]，共有81個元素，從array[0][0]~array[8][8]
	       int array[][] = new int[9][9];
	 
	       for(int i=1;i<=9;i++)
	          for(int j=1;j<=9;j++)
	        	  array[i-1][j-1] = i * j;   // 將九九乘法的結果存入二維陣列中
	       for(int i=1;i<=9;i++)
	       {
	          for(int j=1;j<=9;j++)
	             System.out.print(i + "*" + j + "=" + array[i-1][j-1] + "\t");
	          System.out.println();
	       }
	}
}
