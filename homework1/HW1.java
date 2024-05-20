import java.util.Scanner;
import java.util.InputMismatchException;

public class HW1 {
	private int val;
	
	private static void swap(HW1 objA, HW1 objB){
		int tmp = objA.val; // set a tmp
		objA.val = objB.val;
		objB.val = tmp;
	}
	
	public static void main(String[] args){
		System.out.println("# This is the first question #");
		
		Scanner scanner = new Scanner(System.in);
		// Only when you create a new object can you pass the value
		// into the function and then change it.
		HW1 objA = new HW1(); // 
		HW1 objB = new HW1();
		
		while(true){
			try{
				System.out.print("Please enter the first number(int):");
				objA.val = scanner.nextInt();
				
				System.out.print("Please enter the second number(int):");
				objB.val = scanner.nextInt();
				scanner.close();
				break;
			} catch(InputMismatchException e){ // catch input mismatch
				System.out.println("Please make sure the format is right!");
				scanner.next(); // clear the error input
			}
			catch(Exception e){ // catch all exceptions
				System.out.println("Please make sure the format is right!");
				scanner.next(); // clear the error input
			}
		}
		
		System.out.println("Before swap: A = " + objA.val + ", B = " + objB.val);
		swap(objA, objB); // exchange it in the function after passing in the object
		System.out.println("After swap: A = " + objA.val + ", B = " + objB.val);
		
		return;
	}
}
