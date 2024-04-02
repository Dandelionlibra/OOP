package ch04;

public class CH0416 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
        int i = 1;   // 變數宣告
        do {
            System.out.print("|" + i + "|");
            i++;
            if ( i > 5 ) break; // 跳出迴圈
        } while ( true );
        System.out.print("\n");
	}
}
