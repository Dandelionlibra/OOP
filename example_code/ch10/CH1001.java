package ch10;
class CThread01
{
   private String id;
   public CThread01(String str)            // �غc���A�]�w��Ʀ���id
   {
      id=str;
   }
   public void run()                // run() method
   {
      for(int i=0;i<4;i++)
      {
         for(int j=0;j<100000000;j++);    // �Űj��A�Ψө�C14����檺�t��
         System.out.println(id+" is running..");
      }
   }
}
public class CH1001 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CThread01 th01=new CThread01("th01 run");
		CThread01 th02=new CThread01("th02 run");
		th01.run();
		th02.run();
	}
}
