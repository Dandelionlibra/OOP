package ch04;

public class CH0418 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        int target, guess;  // �ܼƫŧi
        java.util.Scanner sc = new java.util.Scanner(System.in);
        target = (int)(Math.random()*100 + 1); // ����1~100
        // do while�j��ԭz
        do {   // �L�a�j��
            System.out.print("�п�J�q���� (1~100)=> ");
            guess = sc.nextInt(); // ���o���
            if ( guess == target ) {
                break;    // ���X�j��
            }
            else {
                if ( guess > target )
                    System.out.println("�Ʀr�Ӥj!");
                else
                    System.out.println("�Ʀr�Ӥp!");
            }
        } while ( true );
        System.out.println("�q���Ʀr: " + target);
        sc.close();
	}
}
