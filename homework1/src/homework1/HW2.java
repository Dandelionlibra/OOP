package homework1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW2 {
	private static boolean judge3(int num){
		if(num%3 == 0)
			return true;
		return false;
	}
	private static boolean judge5(int num){
		if(num%5 == 0)
			return true;
		return false;
	}
	private static boolean judge7(int num){
		if(num%5 == 0)
			return true;
		return false;
	}
	
	public static void main(String[] args){
		System.out.println("# This is the second question #");
		
		Scanner scanner = new Scanner(System.in);
		int num;
		
		while(true){
			try{
				System.out.print("Please enter the number:");
				num = scanner.nextInt();
				scanner.close();
				break;
			} catch(InputMismatchException e){
				System.out.println("Please make sure the format is right!");
				scanner.next(); // clear the error input
			}
		}
		
		// check one by one whether it is divisible by 3, 5, 7
		if(judge3(num) && judge5(num) && judge7(num))
			System.out.println("The input number "+num+" can divisible by 3, 5, or 7!");
		else
			System.out.println("The input number "+num+" can't divisible by 3, 5, or 7!");
		
		return;
	}
}
