package ch04;

public class CH0417 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        int i = 1;   // �ܼƫŧi
        for ( i = 1; i <= 6; i++ ) {
            // �~��j��
            if ( (i % 2) == 1 ) continue;
            System.out.print("|" + i + "|");
        }
        System.out.print("\n");
	}
}
