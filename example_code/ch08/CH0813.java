package ch08;
interface ICircle_New        //定義介面
{
    public static final double pi=3.14;  //宣告field
    public abstract void computeArea();  //宣告method
    public default void show()           //宣告介面預設 method (要加 default)
    {
        System.out.println("(在ICircle_New中預設的 show 方法) pi=" + pi);   
    }    
}
class CShape_New
{
    protected double area;
    public void show()
    {
        System.out.println("(在 CShape_New 中預設的 show 方法)  area = " + area);   	
    }
}
class CCircle_New1 implements ICircle_New   //實作介面
{   
   protected double radius;
   protected double area;
   public CCircle_New1(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
}
class CCircle_New2 extends CShape_New implements ICircle_New   //繼承並實作介面
{   
   protected double radius;
   public CCircle_New2(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
}
class CCircle_New3 extends CShape_New implements ICircle_New   //繼承並實作介面
{   
   protected double radius;
   public CCircle_New3(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }
   @Override public void show()          //改寫了show 函式
   {
        System.out.println("(已改寫 的 show方法)  radius=" + radius + " area=" +area);
   }
}
public class CH0813 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCircle_New1 cc1 = new CCircle_New1(5.0);
		CCircle_New2 cc2 = new CCircle_New2(5.0);
		CCircle_New3 cc3 = new CCircle_New3(5.0);
        cc1.computeArea();
        cc1.show();  
        cc2.computeArea();
        cc2.show();       
        cc3.computeArea();
        cc3.show();
	}
}
