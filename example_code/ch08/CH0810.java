package ch08;

abstract class CShapeO               // 定義抽象類別 CShapeO
{
	protected String color;
	public void setColor(String str)    // 一般的函數
	{
	    color=str;
	}
	public abstract void show(); // 只定義函數名稱的 抽象函數
}
class CRectangleO extends CShapeO    // 子類別 矩形 CRectangleO
{
	protected int width,height;
	public CRectangleO(int w,int h)  //建構元
	{
        width=w;
        height=h;
    }
	public void show()      // 定義繼承而來的抽象函數 show() 的處理方式
	{
		System.out.print("color="+color+",  ");
		System.out.println("area="+width*height);
    }
}
class CCircleO extends CShapeO     // 子類別 圓形CCircleO
{
   protected double radius;
   public CCircleO(double r)   //建構元
   {
        radius=r;
   }
   public void show()      // 定義繼承而來的抽象函數 show() 的處理方式
   {
        System.out.print("color="+color+",  ");
        System.out.println("area="+3.14*radius*radius);
   }
}
public class CH0810 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CRectangleO rect=new CRectangleO(5,10);  //透過子類別建立物件
	    rect.setColor("Yellow");   // 呼叫父類別函數 setColor()
	    rect.show();         // 呼叫子類別函數 show() method

	    CCircleO cir=new CCircleO(2.0);
	    cir.setColor("Green");     // 呼叫父類別函數 setColor()
	    cir.show();         // 呼叫子類別函數 show()
	}
}
