package ch08;
interface ICircle_New        //�w�q����
{
    public static final double pi=3.14;  //�ŧifield
    public abstract void computeArea();  //�ŧimethod
    public default void show()           //�ŧi�����w�] method (�n�[ default)
    {
        System.out.println("(�bICircle_New���w�]�� show ��k) pi=" + pi);   
    }    
}
class CShape_New
{
    protected double area;
    public void show()
    {
        System.out.println("(�b CShape_New ���w�]�� show ��k)  area = " + area);   	
    }
}
class CCircle_New1 implements ICircle_New   //��@����
{   
   protected double radius;
   protected double area;
   public CCircle_New1(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
}
class CCircle_New2 extends CShape_New implements ICircle_New   //�~�Өù�@����
{   
   protected double radius;
   public CCircle_New2(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }  
}
class CCircle_New3 extends CShape_New implements ICircle_New   //�~�Өù�@����
{   
   protected double radius;
   public CCircle_New3(double i){ radius = i; }   
   @Override public void computeArea()
   {
        area = radius * radius * pi;
   }
   @Override public void show()          //��g�Fshow �禡
   {
        System.out.println("(�w��g �� show��k)  radius=" + radius + " area=" +area);
   }
}
public class CH0813 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
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
