package ch04;
import java.util.Scanner;

public class CH0405 {

	public static void main(String[] args) {
		System.out.printf("�п�J�A(�p)������ :"); 
		Scanner ScoreStr = new Scanner(System.in);
		int ScoreNum = ScoreStr.nextInt();
		if(ScoreNum >= 90) {
			System.out.println("�A(�p)�����Ƶ��ŬO A");
		}else if(ScoreNum >= 80) {
			System.out.println("�A(�p)�����Ƶ��ŬOB");
		}else if(ScoreNum >= 70) {
			System.out.println("�A(�p)�����Ƶ��ŬOC");
		}else if(ScoreNum >= 60) {
			System.out.println("�A(�p)�����Ƶ��ŬOD");
		}else {
			System.out.println("�A(�p)�����Ƶ��ŬOE");
		}
		ScoreStr.close();
	}
}
