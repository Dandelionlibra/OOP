package ch08;
interface ICircle_StaticMethod        //�w�q����
{
    public static void show()
    {
        System.out.println("ICircle_StaticMethod �������R�A��k");   
    }     
}
class CCircle_1 implements ICircle_StaticMethod   //��@����
{   
   public void show()               //�o���O��g�A ���i�H�[�W@Override
   {
        System.out.println("show�����k");
   }   
}
class CCircle_2 implements ICircle_StaticMethod   //��@����
{   
   public static void show() 
   {
        System.out.println("CCircle_2 ���O�w�q���R�A show ");   //�ݩ�CCircle_2���R�A��k
   }   
}
public class CH0814 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCircle_1 cc1 = new CCircle_1();       
		CCircle_2 cc2 = new CCircle_2();       
        cc1.show();            //���檺�O�����kshow
        ICircle_StaticMethod.show();         //���檺�OICircle_StaticMethod �������R�A��kshow
        CCircle_2.show();        //���檺�OCCircle_2���O���R�A��kshow        
	}
}
