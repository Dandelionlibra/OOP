package ch07;
class NewCCircle           // ﹚竡摸NewCCircle
{
   private String color;
   private double pi=3.14;
   private double radius;

   public NewCCircle()                    // ⊿Τま计篶じ
   {
      System.out.println("constructor NewCCircle() called");
      color="Green";
      radius=1.0;
   }
   public NewCCircle(String str, double r)      // Τㄢま计篶じ
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
	  NewCCircle cir1=new NewCCircle();         // ㊣⊿Τま计篶じ
	  cir1.show();

	  NewCCircle cir2=new NewCCircle("Blue",4.0);  // ㊣Τま计篶じ
	  cir2.show();
	}
}
