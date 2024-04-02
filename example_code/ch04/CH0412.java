package ch04;

public class CH0412 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int n, result = 1, maxLevel; // 變數宣告
        java.util.Scanner sc =
                new java.util.Scanner(System.in);
        System.out.print("請輸入階層數=> ");
        maxLevel = sc.nextInt(); // 取得最大階層數
        for (n = 1; n <= maxLevel; n++ ) {
            result = result * n;
        }
        System.out.println(maxLevel + "!=" + result);
	}
}
