package ch05;

public class CH0503 {

	public static void main(String[] args) {
		// �ŧi�G���}�Carray[9][9]�A�@��81�Ӥ����A�qarray[0][0]~array[8][8]
	       int array[][] = new int[9][9];
	 
	       for(int i=1;i<=9;i++)
	          for(int j=1;j<=9;j++)
	        	  array[i-1][j-1] = i * j;   // �N�E�E���k�����G�s�J�G���}�C��
	       for(int i=1;i<=9;i++)
	       {
	          for(int j=1;j<=9;j++)
	             System.out.print(i + "*" + j + "=" + array[i-1][j-1] + "\t");
	          System.out.println();
	       }
	}
}
