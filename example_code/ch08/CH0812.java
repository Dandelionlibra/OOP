package ch08;
interface ICircle        //定義介面
{
    double pi=3.14;     //宣告field
    public void show(); //宣告method
    void computeArea(); //宣告method
}

class CShape2D
{
    protected double area;
    public void show()
    {
        System.out.println("CShape2D area=" + area);   	
    }
}
class CCircle1 extends CShape implements ICircle   //實作介面
{   
   protected double radius;
   public CCircle1(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
   public void show()
   {
       System.out.println("CCircle1 area=" + area);   	
   }
}
public class CH0812 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
       CCircle1 obj = new CCircle1(5.0);
       obj.computeArea();
       obj.show();        
	}
}
