package ch08;
class CCircleNew
{
   protected static double pi=3.14;   // 將pi宣告成protected
   protected double radius;           // 將radius宣告成protected

   public void show()
   {
      System.out.println("area="+pi*radius*radius);
   }
}
class CCoinNew extends CCircleNew   // 定義CCoinNew類別，繼承自CCircleNew類別
{
   private int value;

   public CCoinNew(double r, int v)
   {
      radius=r;      // 在子類別裡可直接取用父類別裡的protected成員
      value=v;
      System.out.println("radius="+radius+", value="+value);
   }
}

public class CH0803 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCoinNew coin=new CCoinNew(2.5,10);
	    coin.show();
	}
}
