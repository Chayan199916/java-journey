public class ThreadInterruption {
    public static void main(String[] args) {
        System.out.println("Inside main thread : " + Thread.currentThread().getName());
        Thread thread = new Thread(new DownloadingTask());
        thread.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        thread.interrupt();
    }

    static class DownloadingTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Inside downloading task : " + Thread.currentThread().getName());
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    return;
                }
                System.out.println("Downloading " + i + " byte");
            }
        }
    }
}
/**
 * this code demonstrates how to interrupt a thread by calling
 * thread.interrupt(). When the main thread interrupts the DownloadingTask
 * thread, the latter checks for interruption and exits the loop when an
 * interruption is detected, terminating the thread. This is a way to gracefully
 * stop a thread's execution.
 */