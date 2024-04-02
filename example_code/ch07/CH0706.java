package ch07;
class NewCCircle2                 // 定義類別 NewCCircle2
{
   private String color;
   private double pi=3.14;
   private double radius;

   public NewCCircle2()           // 沒有引數的建構元
   {
      this("Green",1.0);          // 此行會呼叫第13行的建構元
      System.out.println("constructor NewCCircle2() called");
   }
   public NewCCircle2(String str, double r)    // 有引數的建構元
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
