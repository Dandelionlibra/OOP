package ch10;
class CThread05 extends Thread    // 從Thread類別延伸出子類別
{
   private String id;
   public CThread05(String str)      // 建構元，設定成員id
   {
      id=str;
   }
   public void run()          // 改寫Thread類別裡的run() method
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
		obj1.start();        // 啟動obj1執行緒
	    try {
	    	obj1.join();    // 限制obj1執行緒結束後才能往下執行
	    	obj2.start();   // 啟動obj2執行緒
	    	obj2.join();    // 限制obj2執行緒結束後才能往下執行
	    }
	      catch(InterruptedException e){}
	      System.out.println("main() finished");
	}
}
