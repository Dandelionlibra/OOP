package ch06;
import java.util.Scanner;

public class CH0603 {
    public static int totalSum(int U)
    {
        return odd(U) + even(U);
    }
    public static int odd(int U)    //�p��_�ƩM
    {
        int i,total=0;
        for(i=1;i<=U;i++)
            if(i%2 == 1)
               total = total + i;
        return total;
    }
    public static int even(int U)   //�p�ⰸ�ƩM
    {
        int i,total=0;
        for(i=1;i<=U;i++)
            if(i%2 == 0)
               total = total + i;
        return total;
    }
	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int n,sum = 0;
        char addChoice;
        Scanner keyboardInput = new Scanner(System.in);
          
        System.out.print("1+2+...+n=?�п�Jn=");
        n = Integer.parseInt(keyboardInput.nextLine());
        System.out.print("�аݭn���_�ƩM(O),���ƩM(E),�٬O��ƩM(T)?");
        System.out.print("�п��:");
        addChoice = keyboardInput.nextLine().charAt(0);
        switch(addChoice)
        {
            case 'O': sum = odd(n);
                      break;
            case 'E': sum = even(n);
                      break;
            case 'T': sum = totalSum(n);
                      break;
            default:  System.out.println("��ܿ��~");
            		  break;
        }
        System.out.println("�`�M��" + sum);
        keyboardInput.close();
	}
}
