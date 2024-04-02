package ch07;
class CClassTest
{
    public int var=10;    //成員變數 
    public void show_this()
    {
        System.out.println(this);
    }
} 
public class CH0705 {

	public static void main(String[] args) {
		CClassTest X = new CClassTest();
		CClassTest Y = new CClassTest();
        System.out.print("X物件實體所在位址=");
        X.show_this();         
        System.out.print("Y物件實體所在位址=");
        Y.show_this();
	}
}
