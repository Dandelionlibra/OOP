package ch08;
interface ICircle_1        //�w�q����
{
    public static final double pi=3.14;  
    public abstract void show();
    public abstract void computeArea();
}
interface IColor_1        //�w�q����
{
    public abstract void draw(int i);
}

class CShape_1
{
    protected double area;
    public void show()
    {
        System.out.println("area=" + area);   	
    }
}
class CCircle_Muli extends CShape_1 implements ICircle_1,IColor_1 
{   
   protected double radius;
   public CCircle_Muli(double i){ radius = i; }   
   @Override public void computeArea()     //��@ ICircle_1 computeArea() 
   {
        area = radius * radius * pi;
   }
   @Override public void draw(int i)       //��@ IColor_1 draw() 
   {
        if(i==0)      System.out.println("�ϧά��Ŧ���");
        else if(i==1) System.out.println("�ϧά�������");
        else if(i==2) System.out.println("�ϧά������");
        else          System.out.println("�C����~");
   }     
}
public class CH0815 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCircle_Muli obj = new CCircle_Muli(5.0);
        obj.computeArea();
        obj.show();
        obj.draw(1);        
	}
}
