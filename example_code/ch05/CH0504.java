package ch05;

public class CH0504 {

	public static void main(String[] args) {
	      int i,j,sum=0;
	      int sale[][]={{44,40,55,37},{55,60,28,42}}; // �ŧi�}�C�ó]�w���
	      for(i=0;i<sale.length;i++) // ��X�P��q�íp���`�P��q
	      {
	         System.out.print("�P���"+(i+1)+"���~�Z���O�� :  ");
	          for(j=0;j<sale[i].length;j++)
	          {
	             System.out.print(sale[i][j]+"   ");
	             sum+=sale[i][j];
	          }
	          System.out.println();        // �C�L����
	      }
	      System.out.println("\n�`�P��q��"+sum+"����");
	}
}
