package ch10;
class CThread03 implements Runnable     // ��CThread03���O��@Runnable����
{
   private String id;
   public CThread03(String str)         // �غc���A�]�w����id
   {
      id=str;
   }
   public void run()    // �Բөw�qrunnable() �����̪� run() method
   {
      for(int i=0;i<4;i++)
      {
         for(int j=0;j<100000000;j++); // �Űj��A�Ψө�C14����檺�t��
         System.out.println(id+" is running..");
      }
   }
}
public class CH1003 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CThread03 obj1=new CThread03("obj1");
		CThread03 obj2=new CThread03("obj2");
	    Thread th01=new Thread(obj1);    // ����Thread���O������th01
	    Thread th02=new Thread(obj2);    // ����Thread���O������th02
	    th01.start();             // ��th01�Ұʰ����
	    th02.start();             // ��th02�Ұʰ����
	}

}
