package ch07;
class CClassTest
{
    public int var=10;    //�����ܼ� 
    public void show_this()
    {
        System.out.println(this);
    }
} 
public class CH0705 {

	public static void main(String[] args) {
		CClassTest X = new CClassTest();
		CClassTest Y = new CClassTest();
        System.out.print("X�������Ҧb��}=");
        X.show_this();         
        System.out.print("Y�������Ҧb��}=");
        Y.show_this();
	}
}
