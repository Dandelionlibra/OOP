package ch08;
class CCFatherN1
{
    public int varN;
    public CCFatherN1()
    {
        System.out.println("�����O�غc�l CCFatherN1()���椤....");
        varN = 100;
    }
    public CCFatherN1(int n)
    {
        System.out.println("�����O�غc�lCCFatherN1(int n)���椤....");
        varN = n;
    }
}
class CCSonN1 extends CCFatherN1   // ���OCCSon�~�Ӧ����OCCFather
{
	public int varN;
    public CCSonN1(int i)
    {
    	super(i);
        System.out.println("�l���O�غc�lCCSonN1(int i)���椤....");    
        varN = 200;
    }
    public void show()  
    {
        System.out.println("�����O�� varX=" + super.varN);
        System.out.println("�l���O�� varX=" + varN);
    }
}
public class CH0802 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCSonN1 S1 = new CCSonN1(50);
		S1.show();
	}
}
