package ch05;

public class CH0504 {

	public static void main(String[] args) {
	      int i,j,sum=0;
	      int sale[][]={{44,40,55,37},{55,60,28,42}}; // 宣告陣列並設定初值
	      for(i=0;i<sale.length;i++) // 輸出銷售量並計算總銷售量
	      {
	         System.out.print("銷售員"+(i+1)+"的業績分別為 :  ");
	          for(j=0;j<sale[i].length;j++)
	          {
	             System.out.print(sale[i][j]+"   ");
	             sum+=sale[i][j];
	          }
	          System.out.println();        // 列印換行
	      }
	      System.out.println("\n總銷售量為"+sum+"部車");
	}
}
