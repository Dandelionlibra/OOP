package ch08;
class CAA                    // 定義CAA類別
{
   private int num;
   public CAA(int n)
   {
      num=n;
   }
}
class CBB                    // 定義CAA類別
{
   private int num;
   public CBB(int n)
   {
      num=n;
   }
   public String toString() {        //改寫 toString()
	   String str = "num 的值是" + num;
	   return str;
   }
}

public class CH0809 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CAA caa = new CAA(5);
		CBB cbb = new CBB(5);
		System.out.println(caa.toString());
		System.out.println(cbb.toString());
	}
}
