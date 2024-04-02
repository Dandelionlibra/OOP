package homework1;

public class HW3 {
	public static void main(String[] args){
		System.out.println("# This is the third question #");
		
		for(int i = 1 ; i < 5 ; i++) { // control height is 5
			for(int j = 1 ; j < 5-i ; j++) // control print " "
				System.out.print(" ");
			
			for(int j = 1 ; j < 2*i ; j++) // control print "*"
				System.out.print("*");
			
			System.out.print("\n"); // newline
		}
		return;
	}
}
