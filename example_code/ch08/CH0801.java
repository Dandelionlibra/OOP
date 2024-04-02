package ch08;

class CCFather
{
    protected int varF;
    public CCFather()
    {
        System.out.println("父類別建構子執行中....");
        varF = 100;
    }
}
class CCSon extends CCFather   // 類別CCSon繼承自類別CCFather
{
    public CCSon()
    {
        System.out.println("子類別建構子執行中....");    	 
    }
    public void show()  
    {
        System.out.println("varX=" + varF);
    }
}
public class CH0801 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCSon objS =  new CCSon();           //objS是子類別物件
		objS.show();
	}
}
