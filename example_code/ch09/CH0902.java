package ch09;

public class CH0902 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	      try         // 檢查這個程式區塊的程式碼
	      {
	         int arr[]=new int[5];
	         arr[6]=10;
	      }
	      catch(ArrayIndexOutOfBoundsException e)
	      {
	         System.out.println("index out of bound!!");
	      }
	      finally        // 這個區塊的程式碼一定會執行
	      {
	         System.out.println("this line is always executed!!");
	      }
	      System.out.println("end of main() method!!");
	}
}
