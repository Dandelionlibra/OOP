package ch08;

abstract class CShapeO               // �w�q��H���O CShapeO
{
	protected String color;
	public void setColor(String str)    // �@�몺���
	{
	    color=str;
	}
	public abstract void show(); // �u�w�q��ƦW�٪� ��H���
}
class CRectangleO extends CShapeO    // �l���O �x�� CRectangleO
{
	protected int width,height;
	public CRectangleO(int w,int h)  //�غc��
	{
        width=w;
        height=h;
    }
	public void show()      // �w�q�~�ӦӨӪ���H��� show() ���B�z�覡
	{
		System.out.print("color="+color+",  ");
		System.out.println("area="+width*height);
    }
}
class CCircleO extends CShapeO     // �l���O ���CCircleO
{
   protected double radius;
   public CCircleO(double r)   //�غc��
   {
        radius=r;
   }
   public void show()      // �w�q�~�ӦӨӪ���H��� show() ���B�z�覡
   {
        System.out.print("color="+color+",  ");
        System.out.println("area="+3.14*radius*radius);
   }
}
public class CH0810 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CRectangleO rect=new CRectangleO(5,10);  //�z�L�l���O�إߪ���
	    rect.setColor("Yellow");   // �I�s�����O��� setColor()
	    rect.show();         // �I�s�l���O��� show() method

	    CCircleO cir=new CCircleO(2.0);
	    cir.setColor("Green");     // �I�s�����O��� setColor()
	    cir.show();         // �I�s�l���O��� show()
	}
}
