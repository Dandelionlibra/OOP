package ch03;

public class CH0304 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        int x = 10, y = 10;  // 宣告變數
        x++;   // 遞增
        System.out.println("遞增運算: x = 10 --> x++ = " + x);
        y--;   // 遞減
        System.out.println("遞減運算: y = 10 --> y-- = " + y);
        // 測試遞增和遞減運算子
        x = 10;
        y = x++;   // 運算子在後
        System.out.println("x = " + x);
        System.out.println("y = x++ = " + y);
        x = 10;
        y = --x;   // 運算子在前
        System.out.println("x = " + x);
        System.out.println("y = --x = " + y);
	}
}
