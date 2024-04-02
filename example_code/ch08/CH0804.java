package ch08;
class CCircleOverride             // 父類別CCircle
{
   protected static double pi=3.14;
   protected double radius;
   public CCircleOverride(double r)
   {
      radius=r;
   }
   public void show()         // 父類別裡的show() method
   {
	  System.out.println("CCircleOverride show() is called");  
      System.out.println("radius="+radius);
   }
}
class CCoinOverride extends CCircleOverride   // 子類別CCoinOverride
{
   private int value;

   public CCoinOverride(double r,int v)
   {
      super(r);
      value=v;
   }
   public void show()         // 子類別裡的show() method
   {
	  System.out.println("CCoinOverride show() is called"); 
      System.out.println("radius="+radius+", value="+value);
   }
}

public class CH0804 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		// CCoinOverride CCoin = new CCoinOverride(2.0,5);
		// CCoin.show();         // 呼叫show() method
		CCircleOverride CCir=new CCoinOverride(2.0,5);
		CCir.show();         // 呼叫show() method
	}
}
