package ch09;

public class CH0902 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	      try         // �ˬd�o�ӵ{���϶����{���X
	      {
	         int arr[]=new int[5];
	         arr[6]=10;
	      }
	      catch(ArrayIndexOutOfBoundsException e)
	      {
	         System.out.println("index out of bound!!");
	      }
	      finally        // �o�Ӱ϶����{���X�@�w�|����
	      {
	         System.out.println("this line is always executed!!");
	      }
	      System.out.println("end of main() method!!");
	}
}
