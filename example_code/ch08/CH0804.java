package ch08;
class CCircleOverride             // �����OCCircle
{
   protected static double pi=3.14;
   protected double radius;
   public CCircleOverride(double r)
   {
      radius=r;
   }
   public void show()         // �����O�̪�show() method
   {
	  System.out.println("CCircleOverride show() is called");  
      System.out.println("radius="+radius);
   }
}
class CCoinOverride extends CCircleOverride   // �l���OCCoinOverride
{
   private int value;

   public CCoinOverride(double r,int v)
   {
      super(r);
      value=v;
   }
   public void show()         // �l���O�̪�show() method
   {
	  System.out.println("CCoinOverride show() is called"); 
      System.out.println("radius="+radius+", value="+value);
   }
}

public class CH0804 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		// CCoinOverride CCoin = new CCoinOverride(2.0,5);
		// CCoin.show();         // �I�sshow() method
		CCircleOverride CCir=new CCoinOverride(2.0,5);
		CCir.show();         // �I�sshow() method
	}
}
