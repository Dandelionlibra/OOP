package ch06;

public class CH0607 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	   int ArrayA[][]={{18,32,65,27,30},{17,56,12,66}};  // �ŧi�G���}�CArrayA
	   int ArrayB[][];

	   ArrayB=add10(ArrayA);   // �I�sadd10()�A�ç�Ǧ^���ȳ]���}�CArrayB
	   for(int i=0;i<ArrayB.length;i++) // �L�X�}�C�����e
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
	         arr[i][j]+=10;        // �N�}�C�����[10
	   return arr;              // �Ǧ^�G���}�C
	}
}
