package ch04;

public class CH0413 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
		 int maxValue;  // �ܼƫŧi
	     int n = 1;
	     int result = 1;
	     java.util.Scanner sc = new java.util.Scanner(System.in);
	     System.out.print("�п�JN!���h�ȻݶW�L=> ");
	     maxValue = sc.nextInt(); // ���o�̤j���h��
	     // while�j��ԭz
	     while (result <= maxValue){
	         result = result * n;
	         n = n + 1;  // while�j�骺�p�ƾ�
	     }
	     n = n - 1;
	     System.out.println(n + "!= " + result);
	}
}
