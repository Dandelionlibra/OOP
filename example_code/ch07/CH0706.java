package ch07;
class NewCCircle2                 // �w�q���O NewCCircle2
{
   private String color;
   private double pi=3.14;
   private double radius;

   public NewCCircle2()           // �S���޼ƪ��غc��
   {
      this("Green",1.0);          // ����|�I�s��13�檺�غc��
      System.out.println("constructor NewCCircle2() called");
   }
   public NewCCircle2(String str, double r)    // ���޼ƪ��غc��
   {
      System.out.println("constructor NewCCircle2(String,double) called");
      color=str;
      radius=r;
   }
   public void show()
   {
      System.out.println("color="+color+", Radius="+radius);
      System.out.println("area="+pi*radius*radius);
   }
}
public class CH0706 {
	public static void main(String[] args) {
		NewCCircle2 cir1=new NewCCircle2();
	    cir1.show();
	}
}
