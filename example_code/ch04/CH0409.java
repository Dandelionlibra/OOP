package ch04;

public class CH0409 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	      int a=50,b=25;
	      char oper='/';

	      switch (oper)
	      {
	         case '+':         // �L�Xa+b
	            System.out.println(a+"+"+b+"="+(a+b));
	            break;
	         case '-':         // �L�Xa-b
	            System.out.println(a+"-"+b+"="+(a-b));
	            break;
	         case '*':         // �L�Xa*b
	            System.out.println(a+"*"+b+"="+(a*b));
	            break;
	         case '/':         // �L�Xa/b
	            System.out.println(a+"/"+b+"="+((float)a/b));
	            break;
	         default:          // �L�X�r��
	            System.out.println("���w�q�B��!!");
	      }

	}
}
