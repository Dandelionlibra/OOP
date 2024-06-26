package ch12;

public class CH1201 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		// MyThread obR = new MyThread();
		Thread t = new Thread(() -> {
			// 實作Runnable介面物件的run()方法
			// run()方法進行執行緒所執行的處理，依序將目前的執行緒印10次
			for (int i = 1; i <= 10; i++) {
				System.out.println(Thread.currentThread().getName() + "; 印第 " + i + " 次");
			}
		});
		t.start();
	}
}
