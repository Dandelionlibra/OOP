package ch10;
class CBankM
{
   private static int sum=0;
   synchronized public static void add(int n)
   {
      int tmp=sum;
      tmp=tmp+n;            // �֥[�״��`�B
      try
      {
         Thread.sleep((int)(1000*Math.random()));   // �p��0~1����
      }
      catch(InterruptedException e){}
      sum=tmp;
      System.out.println("sum= "+sum);
  }
}
class CCustomerM extends Thread // CCustomerM���O�A�~�Ӧ�Thread���O
{
   public void run()        // run() method
   {
      for(int i=1;i<=3;i++)
    	  CBankM.add(100);       // �N100�����T���פJ
   }
}
public class CH1007 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCustomerM c1=new CCustomerM();
		CCustomerM c2=new CCustomerM();
	    c1.start();
	    c2.start();
	}
}
