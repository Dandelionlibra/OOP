class CThread04 extends Thread    // �qThread���O�����X�l���O
{
   private String id;
   static int count = 0;
   public CThread04(String str)      // �غc���A�]�w����id
   {
      id=str;
   }
   public void run()          // ��gThread���O�̪�run() method
   {
      for(int i=0;i<4;i++)
      {  System.out.println(count + " " +id+" is entering..");
         try
         {
            System.out.println(count + " " +id+" is sleeping..");
            sleep((int)(1000*Math.random()));
            count ++;
         }
         catch(InterruptedException e){
            System.out.println(count + " " +id+" is stopping!!!!!!!!!!!!!!!!");
         }
         System.out.println(count + " " +id+" is running..");
      }
   }
}
public class Main
{
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CThread04 obj1=new CThread04("obj1");
		CThread04 obj2=new CThread04("obj2");
		obj1.start();
		obj1.interrupt();
		obj2.start();
		obj2.interrupt();
	}
}