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
        System.out.println("���O�ܼ�Var��l�Ƨ���" + Var);
        show("��l�Ƥ���");
    }
}
public class CH0710 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CClassThree.show("�ק�e");    //�������O��k
		CClassThree.Var = 20;            //�s�����O�ܼ�
		CClassThree.show("�ק��");    //�������O��k
		CClassThree X = new CClassThree();
        X.show("�ϥΪ���I�s��");
	}
}
