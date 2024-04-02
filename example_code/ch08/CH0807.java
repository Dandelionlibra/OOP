package ch08;
class CA                    // 定義CA類別
{
   private int num;
   public CA(int n)
   {
      num=n;
   }
}

public class CH0807 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	      CA a=new CA(5);
	      Class ca=a.getClass();        // 用變數a呼叫getClass()
	      System.out.println("Class of obj = "+ca);
	}
}
