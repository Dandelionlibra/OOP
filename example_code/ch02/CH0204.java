package ch02;

public class CH0204 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        // 宣告變數
        boolean isRateHigh, isRateLow;
        float rate = 0.1F;
        isRateHigh = (rate >= .02);
        isRateLow = (rate < .02);
        // 顯示變數值/
        System.out.println("isRateHigh = " + isRateHigh);
        System.out.println("isRateLow = " + isRateLow);
	}
}
