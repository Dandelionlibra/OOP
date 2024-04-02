package ch04;

public class CH0414 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        int year = 0;     // 變數宣告
        double amount = 10000;
        double interest, rate = 0.12;   //利率
        // 計算本利和的do/while迴圈
        do {
            interest = amount * rate;
            amount = amount + interest;
            year = year + 1;
        } while ( amount < 20000 );
        System.out.println(year + "年 本利和 = " + amount);
	}
}
