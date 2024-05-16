import java.util.Scanner;
import java.util.InputMismatchException;

public class HW2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1=0;
        double side2=0;
        double angle=0;
        double side3=0;
        while(true){
			try{
		        System.out.println("Please enter the lengths of the two sides of the triangle: ");
		        side1 = scanner.nextDouble();
		        side2 = scanner.nextDouble();
		
		        System.out.println("Please enter the size of the included angle (degrees): ");
				// Convert degrees to radians
		        angle = Math.toRadians(scanner.nextDouble());
		
                scanner.close();
                break;
	        } catch(InputMismatchException e){ // catch input mismatch
				System.out.println(e);
				System.out.println("Please make sure the format is right!");
				scanner.next();
			} catch(Exception e){ // catch all exceptions
				System.out.println(e);
				break;
			}

		}
			side3 = calculateThirdSide(side1, side2, angle);
            System.out.println("The length of the first side is: " + side1);
            System.out.println("The length of the second side is: " + side2);
            System.out.println("The size of the included angle is: " + angle);
            System.out.println("The length of the third side is: " + side3);

    }

    public static double calculateThirdSide(double side1, double side2, double angle) {
    	double ans = 0.0;
    	try{
    		// a2=b2+c2-2bc*cosA
    		ans = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2) - 2 * side1 * side2 * Math.cos(angle));
    	} catch(Exception e){
			System.out.println(e);
		}		
        return ans;
    }
}