package ch06;

public class CH0606 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	   int Array[][]={{10,20,30,40,50},{60,70,80,90}};    // �w�q�G���}�C
	   printArray(Array);
	}
	public static void printArray(int arr[][])
	{
	   for(int i=0;i<arr.length;i++)
	   {
	      for(int j=0;j<arr[i].length;j++)
	         System.out.print(arr[i][j]+" ");        // �L�X�}�C��
	      System.out.print("\n");
	   }
	}
}
