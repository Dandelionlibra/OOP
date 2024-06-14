package ch10;
class CBank
{
   private static int sum=0;
   public static void add(int n)
   {
      int tmp=sum;
      tmp=tmp+n;            // 累加匯款總額
      try
      {
         Thread.sleep((int)(1000*Math.random()));   // 小睡0~1秒鐘
      }
      catch(InterruptedException e){}
      sum=tmp;
      System.out.println("sum= "+sum);
  }
}
class CCustomer extends Thread // CCustomer類別，繼承自Thread類別
{
   public void run()        // run() method
   {
      for(int i=1;i<=3;i++)
         CBank.add(100);       // 將100元分三次匯入
   }
}
public class CH1006 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	    CCustomer c1=new CCustomer();
	    CCustomer c2=new CCustomer();
	    c1.start();
	    c2.start();
	}
}
