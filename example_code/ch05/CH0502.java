package ch05;

public class CH0502 {

	public static void main(String[] args) {
	      int i,min,max;
	      int a[]={20,50,10,70,20};  // �ŧi��ư}�Ca,�ó]�w���

	      min=max=a[0];
	      System.out.print("�}�C�̭����U������ :   ");
	      for(i=0;i<a.length;i++)
	      {
	         System.out.print(a[i]+"  ");
	         if(a[i]>max)            // ��X�̤j��
	            max=a[i];
	         if(a[i]<min)            // ��X�̤p��
	            min=a[i];
	      }
	      System.out.println("\n�̤j�ȬO : "+max);  // �L�X�̤j��
	      System.out.println("�̤p�ȬO : "+min);    // �L�X�̤p��
	}
}
