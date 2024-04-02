package ch06;
import java.util.Scanner;

public class CH0602 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		float total, base;
		int exponent;
		Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入底數: "); 
        base = scanner.nextFloat();
        System.out.print("請輸入指數: "); 
        exponent = scanner.nextInt();
        total = Power(base, exponent);
        System.out.print(base + "的" + exponent + "次方是" + total);
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
