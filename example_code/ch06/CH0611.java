package ch06;

public class CH0611 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.print("費氏數列如下:");
        for(int i=0;i<=25;i++)
        {
           if(i%6==0)        //換行
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
