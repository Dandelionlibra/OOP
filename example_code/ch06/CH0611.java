package ch06;

public class CH0611 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		System.out.print("�O��ƦC�p�U:");
        for(int i=0;i<=25;i++)
        {
           if(i%6==0)        //����
              System.out.println();
           System.out.print(Fib(i) + "\t");
        }   
        System.out.println("......");

	}
	public static int Fib(int n)
    {
        if((n==1) || (n==0))
          return n;
        else
          return Fib(n-1) + Fib(n-2);
    }
}
