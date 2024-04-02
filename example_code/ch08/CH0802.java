package ch08;
class CCFatherN1
{
    public int varN;
    public CCFatherN1()
    {
        System.out.println("父類別建構子 CCFatherN1()執行中....");
        varN = 100;
    }
    public CCFatherN1(int n)
    {
        System.out.println("父類別建構子CCFatherN1(int n)執行中....");
        varN = n;
    }
}
class CCSonN1 extends CCFatherN1   // 類別CCSon繼承自類別CCFather
{
	public int varN;
    public CCSonN1(int i)
    {
    	super(i);
        System.out.println("子類別建構子CCSonN1(int i)執行中....");    
        varN = 200;
    }
    public void show()  
    {
        System.out.println("父類別的 varX=" + super.varN);
        System.out.println("子類別的 varX=" + varN);
    }
}
public class CH0802 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CCSonN1 S1 = new CCSonN1(50);
		S1.show();
	}
}
