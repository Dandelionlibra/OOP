package ch07;
class CCompareObj                // ﹚竡摸 NewCCircle2
{
	private int Var;
    public CCompareObj(){}       //▆策篋琌干⊿Τ把计篶ㄧΑ
    public CCompareObj(int i)    //俱计把计篶ㄧΑ
    {
        Var=i;       
    }
    public void compare2Obj(CCompareObj Obj)
    {
        if(this==Obj)
           System.out.println("ㄢン单");
        else
           System.out.println("ㄢンぃ单");        
    }
}
public class CH0707 {

	public static void main(String[] args) {
		// TODO 笆玻ネよ猭 Stub
		CCompareObj X = new CCompareObj(5);
		CCompareObj Y = new CCompareObj(5);
		CCompareObj Z = X;
        System.out.print("ンX籔ンY  ");
        X.compare2Obj(Y);
        System.out.print("ンX籔ンZ  ");
        X.compare2Obj(Z);
	}
}
