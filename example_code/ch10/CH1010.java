package ch10;
class SyncThread3 implements Runnable {
    private static int count;
    public SyncThread3() {
        count = 0;
    }
    public void run() {
        synchronized(SyncThread3.class) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
public class CH1010 {
	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		SyncThread3 syncThread = new SyncThread3();
    	Thread thread1 = new Thread(syncThread, "SyncThread1");
    	Thread thread2 = new Thread(syncThread, "SyncThread2");
    	thread1.start();
    	thread2.start();
	}
}
