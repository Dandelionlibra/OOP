package ch09;

public class CH0903 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		try
	      {
	         int arr[]=new int[5];
	         arr[6]=10;
	      }
	      catch(ArrayIndexOutOfBoundsException e)
	      {
	         System.out.println("index out of bound!!");
	         System.out.println("Exception="+e);    // ��ܨҥ~�T��
	      }
	      System.out.println("end of main()!!");

	}
}
