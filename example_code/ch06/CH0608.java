package ch06;

public class CH0608 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int A[]={1,2,3,4,5};
		
		System.out.println("�I�ssquare() method���e...");
	    for(int i=0;i<A.length;i++)     // �L�X�}�C�����e
		   System.out.print(A[i]+" ");
	    System.out.println();
	    square(A);                 // �I�s square()�A�öǻ��}�CA

	    System.out.println("�I�ssquare() method����...");
	    for(int i=0;i<A.length;i++)     // �L�X�}�C�����e
	       System.out.print(A[i]+" ");

	    System.out.println();
	}
	public static void square(int arr[])
	{
	    for(int i=0;i<arr.length;i++)
	       arr[i]=arr[i]*arr[i];         // �N�}�C�������ȥ���
	}
}
