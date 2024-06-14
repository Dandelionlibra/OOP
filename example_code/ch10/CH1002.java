package ch10;
class CThread02 extends Thread    // 從Thread類別延伸出子類別CThread02
{
   private String id;
   public CThread02(String str)      // 建構元，設定成員id
   {
      id=str;
   }
   public void run()          // 改寫Thread類別裡的run() method
   {
      for(int i=0;i<4;i++)
      {
         for(int j=0;j<100000000;j++); // 空迴圈，用來拖慢14行執行的速度
         System.out.println(id+" is running..");
      }
   }
}
public class CH1002 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CThread02 obj1 =new CThread02("obj1");
		CThread02 obj2 =new CThread02("obj2");
		obj1.start();            // 注意是呼叫start(),而不是run()
		obj2.start();            // 注意是呼叫start(),而不是run()
	}
}

