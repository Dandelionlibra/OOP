package ch02;

public class CH0207 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		   String str=null;  
		   // �榡�Ʀr�Ŧ�  
		   str=String.format("�榡�Ѽ�$���ϥΡG%1$d,%2$s", 55,"Java");  
		   // ��X�r�Ŧ��ܶq  
		   System.out.println(str);  
		   System.out.printf("��ܥ��t�ƪ��Ÿ��G%+d�P%d%n", 55,-55);  
		   System.out.printf("�̩��B�����X�O(�e���ťոɹs)�G%03d%n", 7);  
		   System.out.printf("�̩��B�����X�O(�e���d�ť�)�G% 8d%n", 7);  
		   System.out.printf("�@�x��������O�G%,d%n", 1580000);  
		   System.out.printf("Java�Ҹզ��Z�O�G%2.2f��%n", 85.5);  
	}
}
