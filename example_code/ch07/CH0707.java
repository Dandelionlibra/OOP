package ch07;
class CCompareObj                // �w�q���O NewCCircle2
{
	private int Var;
    public CCompareObj(){}       //�}�n���ߺD�O�ɤW�@�ӨS���Ѽƪ��غc�禡
    public CCompareObj(int i)    //�@�Ӿ�ưѼƪ��غc�禡
    {
        Var=i;       
    }
    public void compare2Obj(CCompareObj Obj)
    {
        if(this==Obj)
           System.out.println("�⪫��۵�");
        else
           System.out.println("�⪫�󤣬۵�");        
    }
}
public class CH0707 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CCompareObj X = new CCompareObj(5);
		CCompareObj Y = new CCompareObj(5);
		CCompareObj Z = X;
        System.out.print("����X�P����Y  ");
        X.compare2Obj(Y);
        System.out.print("����X�P����Z  ");
        X.compare2Obj(Z);
	}
}
