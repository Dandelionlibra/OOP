package ch05;
import java.util.Scanner;
public class CH0501 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("�п�J�ǥͤH��: "); 
        int length = scanner.nextInt();
        float[] score = new float[length];  // �ʺA�t�m���� 

        for(int i = 0; i < score.length; i++) {
            System.out.print("��J���ơG");
            float input = scanner.nextFloat();
            score[i] = input;
        }
        System.out.print("\n���ơG");
        float total = 0;
        for(int i = 0; i < score.length; i++) {
            total = total + score[i];
            System.out.print(score[i] + "   ");
        }
        System.out.printf("\n�����G%.2f", total / score.length);
        scanner.close();
    }
}
