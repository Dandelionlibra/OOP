package ch06;

public class CH0604 {

	public static void main(String[] args) {
		// TODO �۰ʲ��ͪ���k Stub
	   int num=5;
	   add10(num);        // �I�sadd10(),�öǻ�num
	   System.out.println("in main(), num = "+num);

	}

	public static void add10(int value)
	{
	   value=value+10;    // �Nvalue���ȥ[10����A�]�^��value
	   System.out.println("in add10(), value = "+value);
	}
}
