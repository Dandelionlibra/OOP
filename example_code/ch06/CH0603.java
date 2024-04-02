package ch06;
import java.util.Scanner;

public class CH0603 {
    public static int totalSum(int U)
    {
        return odd(U) + even(U);
    }
    public static int odd(int U)    //計算奇數和
    {
        int i,total=0;
        for(i=1;i<=U;i++)
            if(i%2 == 1)
               total = total + i;
        return total;
    }
    public static int even(int U)   //計算偶數和
    {
        int i,total=0;
        for(i=1;i<=U;i++)
            if(i%2 == 0)
               total = total + i;
        return total;
    }
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int n,sum = 0;
        char addChoice;
        Scanner keyboardInput = new Scanner(System.in);
          
        System.out.print("1+2+...+n=?請輸入n=");
        n = Integer.parseInt(keyboardInput.nextLine());
        System.out.print("請問要做奇數和(O),偶數和(E),還是整數和(T)?");
        System.out.print("請選擇:");
        addChoice = keyboardInput.nextLine().charAt(0);
        switch(addChoice)
        {
            case 'O': sum = odd(n);
                      break;
            case 'E': sum = even(n);
                      break;
            case 'T': sum = totalSum(n);
                      break;
            default:  System.out.println("選擇錯誤");
            		  break;
        }
        System.out.println("總和為" + sum);
        keyboardInput.close();
	}
}
