package ch10;
class CThread05 extends Thread    // �qThread���O�����X�l���O
{
   private String id;
   public CThread05(String str)      // �غc���A�]�w����id
   {
      id=str;
   }
   public void run()          // ��gThread���O�̪�run() method
   {
      for(int i=0;i<4;i++) {
         try {
            sleep((int)(1000*Math.random()));
         }
         catch(InterruptedException e){}
         System.out.println(id+" is running..");
      }
   }
}
public class CH1005 {
	public static void main(String[] args) {
		CThread05 obj1=new CThread05("obj1");
		CThread05 obj2=new CThread05("obj2");
		obj1.start();        // �Ұ�obj1�����
	    try {
	    	obj1.join();    // ����obj1�����������~�੹�U����
	    	obj2.start();   // �Ұ�obj2�����
	    	obj2.join();    // ����obj2�����������~�੹�U����
	    }
	      catch(InterruptedException e){}
	      System.out.println("main() finished");
	}
}
