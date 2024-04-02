package ch08;
interface ICircle        //�w�q����
{
    double pi=3.14;     //�ŧifield
    public void show(); //�ŧimethod
    void computeArea(); //�ŧimethod
}

class CShape2D
{
    protected double area;
    public void show()
    {
        System.out.println("CShape2D area=" + area);   	
    }
}
class CCircle1 extends CShape implements ICircle   //��@����
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
		// TODO �۰ʲ��ͪ���k Stub
       CCircle1 obj = new CCircle1(5.0);
       obj.computeArea();
       obj.show();        
	}
}
