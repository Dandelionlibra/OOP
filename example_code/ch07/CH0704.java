package ch07;
class NewCCircle           // �w�q���ONewCCircle
{
   private String color;
   private double pi=3.14;
   private double radius;

   public NewCCircle()                    // �S���޼ƪ��غc��
   {
      System.out.println("constructor NewCCircle() called");
      color="Green";
      radius=1.0;
   }
   public NewCCircle(String str, double r)      // ����Ӥ޼ƪ��غc��
   {
      System.out.println("constructor NewCCircle(String,double) called");
      color=str;
      radius=r;
   }
   public void show()
   {
      System.out.println("color="+color+", Radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
}

public class CH0704 {

	public static void main(String[] args) {
	  NewCCircle cir1=new NewCCircle();         // �I�s�S���޼ƪ��غc��
	  cir1.show();

	  NewCCircle cir2=new NewCCircle("Blue",4.0);  // �I�s���޼ƪ��غc��
	  cir2.show();
	}
}
