package ch10;
class CThread03 implements Runnable     // 由CThread03類別實作Runnable介面
{
   private String id;
   public CThread03(String str)         // 建構元，設定成員id
   {
      id=str;
   }
   public void run()    // 詳細定義runnable() 介面裡的 run() method
   {
      for(int i=0;i<4;i++)
      {
         for(int j=0;j<100000000;j++); // 空迴圈，用來拖慢14行執行的速度
         System.out.println(id+" is running..");
      }
   }
}
public class CH1003 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CThread03 obj1=new CThread03("obj1");
		CThread03 obj2=new CThread03("obj2");
	    Thread th01=new Thread(obj1);    // 產生Thread類別的物件th01
	    Thread th02=new Thread(obj2);    // 產生Thread類別的物件th02
	    th01.start();             // 用th01啟動執行緒
	    th02.start();             // 用th02啟動執行緒
	}

}
