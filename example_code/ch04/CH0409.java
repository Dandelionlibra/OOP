package ch04;

public class CH0409 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	      int a=50,b=25;
	      char oper='/';

	      switch (oper)
	      {
	         case '+':         // 印出a+b
	            System.out.println(a+"+"+b+"="+(a+b));
	            break;
	         case '-':         // 印出a-b
	            System.out.println(a+"-"+b+"="+(a-b));
	            break;
	         case '*':         // 印出a*b
	            System.out.println(a+"*"+b+"="+(a*b));
	            break;
	         case '/':         // 印出a/b
	            System.out.println(a+"/"+b+"="+((float)a/b));
	            break;
	         default:          // 印出字串
	            System.out.println("未定義運算!!");
	      }

	}
}
