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
            System.out.println("����X[" + i + "]���骺��}�b" + X[i]);
    }
}

public class CH0708 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		CClassOne X[] = new CClassOne[5];
        for(int i=0;i<X.length;i++)
            X[i] = new CClassOne();
        COtherClass other = new COtherClass();
        other.show(X);
	}
}
