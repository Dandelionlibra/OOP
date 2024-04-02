package ch06;

public class CH0607 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	   int ArrayA[][]={{18,32,65,27,30},{17,56,12,66}};  // 宣告二維陣列ArrayA
	   int ArrayB[][];

	   ArrayB=add10(ArrayA);   // 呼叫add10()，並把傳回的值設給陣列ArrayB
	   for(int i=0;i<ArrayB.length;i++) // 印出陣列的內容
	   {
	      for(int j=0;j<ArrayB[i].length;j++)
	         System.out.print(ArrayB[i][j]+" ");
	      System.out.println();
	   }
	}
	public static int[][] add10(int arr[][])
	{
	   for(int i=0;i<arr.length;i++)
	      for(int j=0;j<arr[i].length;j++)
	         arr[i][j]+=10;        // 將陣列元素加10
	   return arr;              // 傳回二維陣列
	}
}
