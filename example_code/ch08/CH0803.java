package ch08;
class CCircleNew
{
   protected static double pi=3.14;   // �Npi�ŧi��protected
   protected double radius;           // �Nradius�ŧi��protected

   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
class CCoinNew extends CCircleNew   // �w�qCCoinNew���O�A�~�Ӧ�CCircleNew���O
{
   private int value;

   public CCoinNew(double r, int v)
   {
      radius=r;      // �b�l���O�̥i�������Τ����O�̪�protected����
      value=v;
      System.out.println("radius="+radius+", value="+value);
   }
}

public class CH0803 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCoinNew coin=new CCoinNew(2.5,10);
	    coin.show();
	}
}
