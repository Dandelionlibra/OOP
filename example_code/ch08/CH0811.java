package ch08;
interface iShape2D               // 定義介面
{
   final double PI=3.14;
   abstract void area();
}
class CRectangle2D implements iShape2D // 以CRectangle2D類別實作iShape2D介面
{
   int width,height;
   public CRectangle2D(int w,int h)
   {
      width=w;
      height=h;
   }
   public void area()      // 定義area()的處理方式
   {
      System.out.println("area="+width*height);
   }
}
class CCircle2D implements iShape2D // 以CCircle2D類別實作iShape2D介面
{
   double radius;
   public CCircle2D(double r)
   {
      radius=r;
   }
   public void area()      // 定義area()的處理方式
   {
      System.out.println("area="+PI*radius*radius);
   }
}
public class CH0811 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	  CRectangle2D rect=new CRectangle2D(5,10);
      rect.area();         // 呼叫CRectangle類別裡的area() method

      CCircle2D cir=new CCircle2D(2.0);
      cir.area();       // 呼叫CCircle類別裡的area() method
      
      iShape2D Var1,Var2;
      Var1 = new CRectangle2D(5,10);    //以介面變數讀取物件
      Var2 = new CCircle2D(2.0);
      Var1.area();
      Var2.area();

	}
}
