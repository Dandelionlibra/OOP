package ch08;
interface IAttack
{
   void showAttack(); 
}
class CSpider implements IAttack    
{
   public void showAttack()
   {
     System.out.println("�j��H�������O�G60");
     System.out.println("�����覡�|�o�g�j����I\n");
   }
}
class CSuperMan implements IAttack  
{
    public void showAttack()
    {
          System.out.println("�W�H�������O�G100");
          System.out.println("�����覡�ϥή��Y�I\n");
    }
}
public class CH0819 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
          IAttack flag;
          CSpider Bill = new CSpider();
          CSuperMan clark = new CSuperMan();
          flag = Bill;
          flag.showAttack();
          flag = clark;
          flag.showAttack();
	}
}
