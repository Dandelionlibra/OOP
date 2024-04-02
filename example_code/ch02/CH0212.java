package ch02;

import java.util.Scanner;

public class CH0212 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        String str1;
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入一個字串：");
        str1 = scanner.next();
        scanner.nextLine();
        System.out.print("請輸入一個整數：");
        num1 = scanner.nextInt();
        System.out.println("您輸入的字串為：" + str1);
        System.out.println("您輸入的整數為：" + num1);
        scanner.close();
	}
}
