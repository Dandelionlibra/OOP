package ch07;

public class CH0711 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CClassFour X = new CClassFour();
        X.show("�ϥΪ���I�s��");        
	}
}
class CClassFour
{
    public int Var;
    public CClassFour()
    {
        Var = 10;
        System.out.println("�غc�禡���椤");
        show("�غc�禡���槹����");
    }
    public void show(String str)
    {
        System.out.println(str+ "Var=" + Var);        
    }
    {
        Var = 100;
        System.out.println("�L�W�϶����椤");
        show("�L�W�϶����槹����");
    }
}
