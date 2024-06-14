package ch11;
import java.util.*;
public class CH1103 {

	public static void main(String[] args) {
		TreeSet<Integer> tset = new TreeSet<>();
		var number = Set.of(22, 41, 33, 8, 94, 88, 76, 54, 89, 0, -55, 61);
		for (int n : number)
			tset.add(n);
		System.out.println("���󤺤��������e�G");
		System.out.println("  " + tset);
		System.out.println("�Ĥ@�Ӥ������e���G" + tset.first());
		System.out.println("�̫�@�Ӥ������e�G" + tset.last());
		Scanner keyin = new Scanner(System.in);
		int num = 0;
		while (true) {
			System.out.print("�п�J�@�Ӿ�ơH ");
			try {
				num = Integer.parseInt(keyin.nextLine());
			} catch (NumberFormatException ex) {
				System.out.println("  �п�J�ƭȡI");
				continue;
			}
			if (num >= (int) tset.first() && num <= (int) tset.last())
				break;
			else
				System.out.println("  �d����~�I");
		}
		System.out.print("  �������e�j�󵥩�" + num + "�̡G");
		System.out.println(tset.tailSet(num));
		keyin.close();
	}
}
