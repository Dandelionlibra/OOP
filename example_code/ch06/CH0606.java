package ch06;

public class CH0606 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	   int Array[][]={{10,20,30,40,50},{60,70,80,90}};    // 定義二維陣列
	   printArray(Array);
	}
	public static void printArray(int arr[][])
	{
	   for(int i=0;i<arr.length;i++)
	   {
	      for(int j=0;j<arr[i].length;j++)
	         System.out.print(arr[i][j]+" ");        // 印出陣列值
	      System.out.print("\n");
	   }
	}
}
