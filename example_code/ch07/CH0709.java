package ch07;

class CClassTwo         //主類別
{
	public int Var;
    public static int sVar;
    public void show(String str)
    {
    	Var++;
        System.out.println(str + "'s Var=" + Var);        
    }
    public static void add()        //類別方法
    {
        //Var++;         //錯誤,因為類別方法內不可以存取實體變數
        sVar++;
        System.out.println("CClassTwo class sVar=" + sVar);  
    }
}
public class CH0709 {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CClassTwo x1 = new CClassTwo();
		CClassTwo x2 = new CClassTwo(); 
		x1.Var = 3;
		x2.Var = 10;
		x1.sVar = 5;        //使用物件存取類別變數
		x2.sVar = 15;        //使用物件存取類別變數
		x1.add();           //使用物件執行類別方法
		x2.add();           //使用物件執行類別方法  
		x1.show("X1");
		x2.show("x2");
	}
}
