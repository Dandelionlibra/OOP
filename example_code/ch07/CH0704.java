package ch07;
class NewCCircle           // 定義類別NewCCircle
{
   private String color;
   private double pi=3.14;
   private double radius;

   public NewCCircle()                    // 沒有引數的建構元
   {
      System.out.println("constructor NewCCircle() called");
      color="Green";
      radius=1.0;
   }
   public NewCCircle(String str, double r)      // 有兩個引數的建構元
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
	  NewCCircle cir1=new NewCCircle();         // 呼叫沒有引數的建構元
	  cir1.show();

	  NewCCircle cir2=new NewCCircle("Blue",4.0);  // 呼叫有引數的建構元
	  cir2.show();
	}
}
