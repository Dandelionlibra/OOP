package ch08;
class CA                    // �w�qCA���O
{
   private int num;
   public CA(int n)
   {
      num=n;
   }
}

public class CH0807 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	      CA a=new CA(5);
	      Class ca=a.getClass();        // ���ܼ�a�I�sgetClass()
	      System.out.println("Class of obj = "+ca);
	}
}
