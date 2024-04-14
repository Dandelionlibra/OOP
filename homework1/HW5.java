// package homework1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW5 {
	public static boolean isPrime(int num) {
		if(num == 1)
			return false;
		
		double sqrtnum=Math.pow( num , 0.5 ); // if it is not a prime, find the largest factor
		for(int i = (int)sqrtnum ; i > 1 ; i--) {
			if(num%i == 0) // if divisible, not prime
				return false;
		}

		return true;
	}
	public static void main(String[] args){
		System.out.println("# This is the fifth question #");
		
		Scanner scanner = new Scanner(System.in);
		int num;
		
		while(true){
			try{
				System.out.print("Please enter the number(int):");
				num = scanner.nextInt();
				scanner.close();
				break;
			} catch(InputMismatchException e){
				System.out.println("Please make sure the format is right!");
				scanner.next(); // clear the error input
			}
		}
		if(isPrime(num)) // judge prime or not
			System.out.println("The input number "+num+" is a prime number!");
		else
			System.out.println("The input number "+num+" isn't a prime number!");
		
		
		return;
	}
}
