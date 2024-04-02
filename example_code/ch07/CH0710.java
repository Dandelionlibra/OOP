package ch07;
class CClassThree
{
    public static int Var;
    
    public static void show(String str)
    {
        System.out.println(str+ "Var=" + Var);        
    }
    static{
        Var = 100;
        System.out.println("類別變數Var初始化完畢" + Var);
        show("初始化之後");
    }
}
public class CH0710 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CClassThree.show("修改前");    //執行類別方法
		CClassThree.Var = 20;            //存取類別變數
		CClassThree.show("修改後");    //執行類別方法
		CClassThree X = new CClassThree();
        X.show("使用物件呼叫時");
	}
}
