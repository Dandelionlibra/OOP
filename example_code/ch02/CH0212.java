package ch02;

import java.util.Scanner;

public class CH0212 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        String str1;
        int num1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("�п�J�@�Ӧr��G");
        str1 = scanner.next();
        scanner.nextLine();
        System.out.print("�п�J�@�Ӿ�ơG");
        num1 = scanner.nextInt();
        System.out.println("�z��J���r�ꬰ�G" + str1);
        System.out.println("�z��J����Ƭ��G" + num1);
        scanner.close();
	}
}
