package ch08;
interface IXF        //�w�q����
{
    public default void show()
    {
         System.out.println("IX default");
    }
}
interface IYF        //�w�q����
{
    public default void show()
    {
         System.out.println("IYF default");
    }
}
interface IZ extends IXF,IYF
{
   public default void show()  //�����H�w�]��k���y�k�N����g(override)
   {
         IYF.super.show();  //�z�L�����W��.super�ӫ��w�n������@�Ӥ��������w�]��k
   } 
}
class CAZ implements IZ  //��@IZ
{     
}
public class CH0818 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        CAZ obj = new CAZ();
        obj.show();          
	}
}
