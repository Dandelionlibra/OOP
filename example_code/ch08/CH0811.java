package ch08;
interface iShape2D               // �w�q����
{
   final double PI=3.14;
   abstract void area();
}
class CRectangle2D implements iShape2D // �HCRectangle2D���O��@iShape2D����
{
   int width,height;
   public CRectangle2D(int w,int h)
   {
      width=w;
      height=h;
   }
   public void area()      // �w�qarea()���B�z�覡
   {
      System.out.println("area="+width*height);
   }
}
class CCircle2D implements iShape2D // �HCCircle2D���O��@iShape2D����
{
   double radius;
   public CCircle2D(double r)
   {
      radius=r;
   }
   public void area()      // �w�qarea()���B�z�覡
   {
      System.out.println("area="+PI*radius*radius);
   }
}
public class CH0811 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	  CRectangle2D rect=new CRectangle2D(5,10);
      rect.area();         // �I�sCRectangle���O�̪�area() method

      CCircle2D cir=new CCircle2D(2.0);
      cir.area();       // �I�sCCircle���O�̪�area() method
      
      iShape2D Var1,Var2;
      Var1 = new CRectangle2D(5,10);    //�H�����ܼ�Ū������
      Var2 = new CCircle2D(2.0);
      Var1.area();
      Var2.area();

	}
}
