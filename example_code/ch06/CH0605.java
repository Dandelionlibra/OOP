package ch06;

public class CH0605 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int maxNumber = 0;
	    int score[]={35,22,46,19,7,12};  // �ŧi�@���}�Cscore
	    maxNumber = largest(score);    // �N�@���}�Cscore�ǤJlargest() method
	    System.out.print("�̤j�Ƭ� : "+ maxNumber);
	}
	public static int largest(int arr[])
	{
	    int max=arr[0];
	    for(int i=0;i<arr.length;i++)
	      if(max<arr[i])
	         max=arr[i];
	    return  max;
	}
}
