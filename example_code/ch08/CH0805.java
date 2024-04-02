package ch08;

class CShape                  // �����OCShape
{
	protected double area = 0.0;
    public void area()         // �����O�̪�area() method
    {

    }
}
class CCircle extends CShape   
{
    protected double radius = 0.0;
   
    public CCircle(double r) {
	    radius = r;
	    area = 3.14*r*r;
    }
    public void area()         
    {
	    System.out.println("�ꭱ�n�� :" + area);  
    }
}
class CSquare extends CShape   
{
    protected double length = 0.0;
   
    public CSquare(double l) {
	    length = l;
	    area = l*l;
    }
    public void area()         
    {
	    System.out.println("����έ��n�� :" + area);  
    }
}
class CTriangle extends CShape   
{
    public CTriangle(double base, double height) {
	    area = (base*height)/2.0;
    }
    public void area()         
    {
	    System.out.println("�T���έ��n�� :" + area);  
    }
}
public class CH0805 {
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CShape[] cs = new CShape[3];
		cs[0] = new CCircle(5.0);
		cs[1] = new CSquare(5.0);
		cs[2] = new CTriangle(5.0,5.0);
		cs[0].area();
		cs[1].area();
		cs[2].area();
	}
}
