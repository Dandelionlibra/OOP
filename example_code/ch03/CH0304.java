package ch03;

public class CH0304 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
        int x = 10, y = 10;  // �ŧi�ܼ�
        x++;   // ���W
        System.out.println("���W�B��: x = 10 --> x++ = " + x);
        y--;   // ����
        System.out.println("����B��: y = 10 --> y-- = " + y);
        // ���ջ��W�M����B��l
        x = 10;
        y = x++;   // �B��l�b��
        System.out.println("x = " + x);
        System.out.println("y = x++ = " + y);
        x = 10;
        y = --x;   // �B��l�b�e
        System.out.println("x = " + x);
        System.out.println("y = --x = " + y);
	}
}
