package ch10;
class SyncThread  implements Runnable {
	private int count;
   	public SyncThread() {
      count = 0;
   	}
   	public synchronized void run() {
   		for (int i = 0; i < 5; i ++) {
            try {
               System.out.println(Thread.currentThread().getName() + " count:" + count++);
               Thread.sleep(100);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
         }
    }
}
public class CH1008 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		SyncThread  syncThread = new SyncThread();
        Thread thread1 = new Thread(syncThread, "SyncThread1");
        Thread thread2 = new Thread(syncThread, "SyncThread2");
        thread1.start();
        thread2.start();
	}
}
