package ch08;
class CAA                    // �w�qCAA���O
{
   private int num;
   public CAA(int n)
   {
      num=n;
   }
}
class CBB                    // �w�qCAA���O
{
   private int num;
   public CBB(int n)
   {
      num=n;
   }
   public String toString() {        //��g toString()
	   String str = "num ���ȬO" + num;
	   return str;
   }
}

public class CH0809 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CAA caa = new CAA(5);
		CBB cbb = new CBB(5);
		System.out.println(caa.toString());
		System.out.println(cbb.toString());
	}
}
