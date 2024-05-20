import java.util.Scanner;
import java.util.InputMismatchException;

/******************************************************************************
/*  Create a Negative exception class
/*  NegativeException class extends the Exception class
/*  The class has a constructor that takes a string as a parameter
/*  The class has a getMessage method that returns the exception message
/******************************************************************************/
class NegativeException extends Exception{
    String msg;
    public NegativeException(String msg){
			this.msg = msg;
	}
	public String getMessage(){
			return ("Exception message: " + msg);
	}
}

/******************************************************************************
/*  HW2_1 : used to calculate the third side of a triangle
/*  The class contains two methods:
/*  1. main method: used to get the sides and angle of a triangle from the user and calculate the third side
/*  2. calculateThirdSide method: used to calculate the third side of a triangle
/*
/*  The class uses the NegativeException class to handle negative input
/******************************************************************************/

public class HW2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a scanner object
		// Declare variables
        double side1=0;
        double side2=0;
        double angle=0;
        double side3=0;

		// Get user input for the sides and angle
        while(true){
			try{
				// Get the first side from the user
		        System.out.println("Please enter the lengths of the first sides of the triangle: ");
		        side1 = scanner.nextDouble();
				// Check if the side1 is negative
				if(side1 <= 0)
					throw new NegativeException("The side length cannot be negative or zero!");

				// Get the second side from the user
		        System.out.println("Please enter the lengths of the second sides of the triangle: ");
				side2 = scanner.nextDouble();
				// Check if the side2 is negative
				if(side2 <= 0)
					throw new NegativeException("The side length cannot be negative or zero!");

				// Get the angle from the user
		        System.out.println("Please enter the size of the included angle (degrees): ");
		        angle = Math.toRadians(scanner.nextDouble()); // Convert degrees to radians
				// Check if the angle is negative
				if(angle <= 0)
					throw new NegativeException("The angle cannot be negative or zero!");
				
                scanner.close(); // Close the scanner
                break; // Exit the loop!!
	        } catch(InputMismatchException e){ // catch input mismatch
				System.out.println(e); // Print the exception
				System.out.println("Please make sure the format is right!\n");
				scanner.next(); // Clear the buffer, otherwise it will cause infinite loop
				
			}catch(NegativeException e){ // catch negative input
				System.out.println(e.getMessage()); // Print the exception message
				
			}catch(Exception e){ // catch all exceptions
				System.out.println(e); // Print the exception
				scanner.next(); // Clear the buffer, otherwise it will cause infinite loop
			}

		}

		// Calculate the third side
		try{
			side3 = calculateThirdSide(side1, side2, angle);
        }catch(Exception e){ // catch all exceptions in the calculateThirdSide method
			System.out.println(e); // Print the exception
			return; // Exit the program if there is an exception
		}
		System.out.println("The length of the first side is: " + side1);
        System.out.println("The length of the second side is: " + side2);
        System.out.println("The size of the included angle(radians) is: " + angle);
        System.out.println("The length of the third side is: " + side3);

    }

    public static double calculateThirdSide(double side1, double side2, double angle) throws Exception {
    	double ans = 0.0;
    	try{
    		// a2=b2+c2-2bc*cosA
    		ans = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2) - 2 * side1 * side2 * Math.cos(angle));
    	} catch(Exception e){ // catch all exceptions
			System.out.println(e);
		}
        return ans;
    }
}