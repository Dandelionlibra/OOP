package ch04;

public class CH0417 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        int i = 1;   // 變數宣告
        for ( i = 1; i <= 6; i++ ) {
            // 繼續迴圈
            if ( (i % 2) == 1 ) continue;
            System.out.print("|" + i + "|");
        }
        System.out.print("\n");
	}
}
