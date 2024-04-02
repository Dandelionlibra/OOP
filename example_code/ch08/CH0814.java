package ch08;
interface ICircle_StaticMethod        //定義介面
{
    public static void show()
    {
        System.out.println("ICircle_StaticMethod 介面的靜態方法");   
    }     
}
class CCircle_1 implements ICircle_StaticMethod   //實作介面
{   
   public void show()               //這不是改寫， 不可以加上@Override
   {
        System.out.println("show實體方法");
   }   
}
class CCircle_2 implements ICircle_StaticMethod   //實作介面
{   
   public static void show() 
   {
        System.out.println("CCircle_2 類別定義的靜態 show ");   //屬於CCircle_2的靜態方法
   }   
}
public class CH0814 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCircle_1 cc1 = new CCircle_1();       
		CCircle_2 cc2 = new CCircle_2();       
        cc1.show();            //執行的是實體方法show
        ICircle_StaticMethod.show();         //執行的是ICircle_StaticMethod 介面的靜態方法show
        CCircle_2.show();        //執行的是CCircle_2類別的靜態方法show        
	}
}
