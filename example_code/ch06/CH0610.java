package ch06;

public class CH0610 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		System.out.println("1*2*...*4="+fac(4));
	}
	public static int fac(int n)   // fac() method
	{
	    if(n==0)                    // 設定終止條件
	      return 1;
	    else
	      return n*fac(n-1);       // 遞迴計算
	}
}
