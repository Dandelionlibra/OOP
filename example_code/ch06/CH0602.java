package ch06;
import java.util.Scanner;

public class CH0602 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		float total, base;
		int exponent;
		Scanner scanner = new Scanner(System.in);
        System.out.print("�п�J����: "); 
        base = scanner.nextFloat();
        System.out.print("�п�J����: "); 
        exponent = scanner.nextInt();
        total = Power(base, exponent);
        System.out.print(base + "��" + exponent + "����O" + total);
        scanner.close();
	}
	
	public static float Power(float x, int y) {
		float sum = 1.0f;
		for(int i = 1; i <= y; i++) {
			sum = sum*x;
		}
		return sum;
	}
}
