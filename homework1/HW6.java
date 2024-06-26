// package homework1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW6 {
	public static int calculate(int N){
		int c = 1;
		if(N == 0)
			return 0;
		// 1+2-3+4-...-(N-1)+N
		for(int i = 2 ; i <= N ; i++) {
			if(i%2 == 0) // add numbers that are divisible by 2
				c = c + i;
			else // numbers that are not divisible by 2, use subtraction
				c = c - i;
		}
		return c;
	}
	
	public static void main(String[] args){
		System.out.println("# This is the sixth question #");
		
		Scanner scanner = new Scanner(System.in);
		int N;
		
		while(true){
			try{
				System.out.print("Please enter the number(int):");
				N = scanner.nextInt();
				scanner.close();
				break;
			} catch(InputMismatchException e){
				System.out.println("Please make sure the format is right!");
				scanner.next(); // clear the error input
			}
		}
		
		int output = calculate(N); // gain the calculation
		System.out.println("After calculation, the answer is: " + output);
		
		return;
	}
	
}
