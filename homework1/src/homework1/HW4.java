package homework1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HW4 {
	public static double countAverage(int[] score) {
		double avg = 0;
		for(double element : score)
			avg = avg + element; // add all scores one by one
		
		avg = avg/score.length; // divided by the number of scores
		return avg;
	}
	
	public static int findMax(int[] score) {
		int max = -999999999; // setting minimum value
		for(int element : score) {
			if(max < element) // if element > current max, update maximum value
				max = element;
		}
		return max;
	}
	public static void main(String[] args){
		System.out.println("# This is the fourth question #");
		
		Scanner scanner = new Scanner(System.in);
		int score[] = new int[10];
		
		while(true){
			try{
				for(int i = 1 ; i <= score.length ; i++) {
					System.out.print("The "+ i +" number:");
					score[i-1] = scanner.nextInt();
				}
				scanner.close();
				break;
			} catch(InputMismatchException e){
				System.out.println("Please make sure the format is right!");
				scanner.next(); // clear the error input
			}
		}
		
		int max = findMax(score); // find the max score in score[10]
		double avg = countAverage(score); // count the average
		
		System.out.println("The highest score: "+max);
		System.out.println("The average score: "+avg);
		
		return;
	}
}
