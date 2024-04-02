package ch03;

public class CH0305 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        // 變數宣告
        int a = 27;      int b = 5;
        float r;
        // 寬基本型態轉換
        System.out.println("a = " + a + " b = " + b);
        r = a / b;
        System.out.println("r = a / b = " + r);
        // 強迫型態轉換
        r = (float)a / (float)b;
        System.out.println("r = (float)a/(float)b = "+r);
	}
}
