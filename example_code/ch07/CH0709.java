// package ch07;

class CClassTwo         //�D���O
{
	public int Var;
    public static int sVar;
    public void show(String str)
    {
    	Var++;
        System.out.println(str + "'s Var=" + Var);        
    }
    public static void add()        //���O��k
    {
        //Var++;         //���~,�]�����O��k�����i�H�s�������ܼ�
        sVar++;
        System.out.println("CClassTwo class sVar=" + sVar);  
    }
}
public class CH0709 {
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CClassTwo x1 = new CClassTwo();
		CClassTwo x2 = new CClassTwo(); 
		x1.Var = 3;
		x2.Var = 10;
		x1.sVar = 5;        //�ϥΪ���s�����O�ܼ�
		x2.sVar = 15;        //�ϥΪ���s�����O�ܼ�
		x1.add();           //�ϥΪ���������O��k
		x2.add();           //�ϥΪ���������O��k  
		CClassTwo.add();           //�ϥΪ���������O��k  

		x1.show("X1");
		x2.show("x2");
	}
}
