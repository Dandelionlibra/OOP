package ch02;
import java.util.Scanner;
public class CH0211 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        String str1,str2;
        int num1;
        double double1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個字串(1)：");
        str1 = scanner.nextLine();
        System.out.print("請輸入一個整數：");
        num1 = scanner.nextInt();
        System.out.print("請輸入一個浮點數：");
        double1 = scanner.nextDouble();
        System.out.print("請輸入一個字串(2)(必須包含空白)：");
        str2 = scanner.next();
        System.out.println("您輸入的字串(1)為：" + str1);
        System.out.println("您輸入的整數為：" + num1);
        System.out.println("您輸入的浮點數為：" + double1);
        System.out.println("您輸入的字串(2)為：" + str2);
        scanner.close();
	}
}
