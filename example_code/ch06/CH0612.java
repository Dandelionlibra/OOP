package ch06;

public class CH0612 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	    int a=5, b[]={1,2,3,4};
	    show(a);                   // �N���a�ǻ���show()��
	    show(b);                   // �N��ư}�Cb�ǻ���show()
	}
	public static void show(int i)         // �w�qshow(),�i��������ܼ�
	{
	    System.out.println("value= "+i);
	}

	public static void show(int arr[])  // �w�qshow(),�i������ư}�C
	{
	    System.out.print("array=");
	    for(int i=0;i<arr.length;i++)
	       System.out.print(" "+arr[i]);
	    System.out.println();
	}
}