package ch10;
class CThread02 extends Thread    // �qThread���O�����X�l���OCThread02
{
   private String id;
   public CThread02(String str)      // �غc���A�]�w����id
   {
      id=str;
   }
   public void run()          // ��gThread���O�̪�run() method
   {
      for(int i=0;i<4;i++)
      {
         for(int j=0;j<100000000;j++); // �Űj��A�Ψө�C14����檺�t��
         System.out.println(id+" is running..");
      }
   }
}
public class CH1002 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CThread02 obj1 =new CThread02("obj1");
		CThread02 obj2 =new CThread02("obj2");
		obj1.start();            // �`�N�O�I�sstart(),�Ӥ��Orun()
		obj2.start();            // �`�N�O�I�sstart(),�Ӥ��Orun()
	}
}

