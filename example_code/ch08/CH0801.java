package ch08;

class CCFather
{
    protected int varF;
    public CCFather()
    {
        System.out.println("�����O�غc�l���椤....");
        varF = 100;
    }
}
class CCSon extends CCFather   // ���OCCSon�~�Ӧ����OCCFather
{
    public CCSon()
    {
        System.out.println("�l���O�غc�l���椤....");    	 
    }
    public void show()  
    {
        System.out.println("varX=" + varF);
    }
}
public class CH0801 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCSon objS =  new CCSon();           //objS�O�l���O����
		objS.show();
	}
}
