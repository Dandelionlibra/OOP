package ch08;
interface IX        //�w�q����
{
    public default void show()
    {
         System.out.println("IX default");
    }
}
interface IY        //�w�q����
{
    public default void show()
    {
         System.out.println("IY default");
    }
}

class CXY implements IX,IY   //��@��Ӥ���
{
   public void show()       //�@�w�n��gshow()��k
   {
         IY.super.show();
   }  
}
public class CH0816 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CXY obj = new CXY();
        obj.show();          
	}
}
