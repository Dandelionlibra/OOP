package ch07;

public class CH0711 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CClassFour X = new CClassFour();
        X.show("使用物件呼叫時");        
	}
}
class CClassFour
{
    public int Var;
    public CClassFour()
    {
        Var = 10;
        System.out.println("建構函式執行中");
        show("建構函式執行完畢時");
    }
    public void show(String str)
    {
        System.out.println(str+ "Var=" + Var);        
    }
    {
        Var = 100;
        System.out.println("無名區塊執行中");
        show("無名區塊執行完畢時");
    }
}
