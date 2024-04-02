package ch06;

public class CH0604 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
	   int num=5;
	   add10(num);        // 呼叫add10(),並傳遞num
	   System.out.println("in main(), num = "+num);

	}

	public static void add10(int value)
	{
	   value=value+10;    // 將value的值加10之後，設回給value
	   System.out.println("in add10(), value = "+value);
	}
}
