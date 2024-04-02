package ch04;
import java.util.Scanner;

public class CH0405 {

	public static void main(String[] args) {
		System.out.printf("叫块(﹑)だ计 :"); 
		Scanner ScoreStr = new Scanner(System.in);
		int ScoreNum = ScoreStr.nextInt();
		if(ScoreNum >= 90) {
			System.out.println("(﹑)だ计单琌 A");
		}else if(ScoreNum >= 80) {
			System.out.println("(﹑)だ计单琌B");
		}else if(ScoreNum >= 70) {
			System.out.println("(﹑)だ计单琌C");
		}else if(ScoreNum >= 60) {
			System.out.println("(﹑)だ计单琌D");
		}else {
			System.out.println("(﹑)だ计单琌E");
		}
		ScoreStr.close();
	}
}
