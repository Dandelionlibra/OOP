package ch02;
import java.util.Scanner;
public class CH0211 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        String str1,str2;
        int num1;
        double double1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("�п�J�@�Ӧr��(1)�G");
        str1 = scanner.nextLine();
        System.out.print("�п�J�@�Ӿ�ơG");
        num1 = scanner.nextInt();
        System.out.print("�п�J�@�ӯB�I�ơG");
        double1 = scanner.nextDouble();
        System.out.print("�п�J�@�Ӧr��(2)(�����]�t�ť�)�G");
        str2 = scanner.next();
        System.out.println("�z��J���r��(1)���G" + str1);
        System.out.println("�z��J����Ƭ��G" + num1);
        System.out.println("�z��J���B�I�Ƭ��G" + double1);
        System.out.println("�z��J���r��(2)���G" + str2);
        scanner.close();
	}
}
