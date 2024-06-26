package ch09;

public class CH0904 {
    static void printErrMsg(Exception e) {
        System.out.println("例外說明: " + e.getMessage());
        System.out.print("例外原因: ");
        e.printStackTrace();
    }
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		int i;
        int[] data = {22, 14, 36, 68, 87};
        // 例外處理程式敘述
        try {
            int index = (int)(Math.random()*10);
            i = data[index];  // 產生超過陣列範圍例外
            // 產生除以零的例外
            for ( i = 2; i > -1; i-- )
                System.out.println("計算結果: " +10/i);
        }
        catch ( ArithmeticException e ) {
            // 處理除以零的例外
            printErrMsg(e);
        }
        catch ( ArrayIndexOutOfBoundsException e ) {
            // 處理超過陣列範圍例外
            printErrMsg(e);
        }
        finally {
            System.out.println("例外處理結束");
        }
	}
}
