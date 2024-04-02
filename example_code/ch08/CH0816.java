package ch08;
interface IX        //定義介面
{
    public default void show()
    {
         System.out.println("IX default");
    }
}
interface IY        //定義介面
{
    public default void show()
    {
         System.out.println("IY default");
    }
}

class CXY implements IX,IY   //實作兩個介面
{
   public void show()       //一定要改寫show()方法
   {
         IY.super.show();
   }  
}
public class CH0816 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CXY obj = new CXY();
        obj.show();          
	}
}
