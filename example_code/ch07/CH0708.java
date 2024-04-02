package ch07;
class CClassOne
{
	public CClassOne(){}
}
class COtherClass
{    
    public void show(CClassOne X[])
    {
        for(int i=0;i<X.length;i++)
            System.out.println("物件X[" + i + "]實體的位址在" + X[i]);
    }
}

public class CH0708 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		CClassOne X[] = new CClassOne[5];
        for(int i=0;i<X.length;i++)
            X[i] = new CClassOne();
        COtherClass other = new COtherClass();
        other.show(X);
	}
}
