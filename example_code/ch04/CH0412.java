// package ch04;

public class CH0412 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		int n, result = 1, maxLevel; // �ܼƫŧi
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("=> ");
        maxLevel = Interger.parseInt(sc.nextInt()); // ���o�̤j���h��
        for (n = 1; n <= maxLevel; n++ ) {
            result = result * n;
        }
        System.out.println(maxLevel + "!=" + result);
	}
}
