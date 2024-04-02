package ch08;
interface IXF        //定義介面
{
    public default void show()
    {
         System.out.println("IX default");
    }
}
interface IYF        //定義介面
{
    public default void show()
    {
         System.out.println("IYF default");
    }
}
interface IZ extends IXF,IYF
{
   public default void show()  //必須以預設方法的語法將之改寫(override)
   {
         IYF.super.show();  //透過介面名稱.super來指定要執行哪一個父介面的預設方法
   } 
}
class CAZ implements IZ  //實作IZ
{     
}
public class CH0818 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        CAZ obj = new CAZ();
        obj.show();          
	}
}
