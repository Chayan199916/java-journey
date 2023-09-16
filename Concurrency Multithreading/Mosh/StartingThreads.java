public class StartingThreads {
    public static void main(String[] args) {
        System.out.println("Inside main thread : " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadingTask());
            thread.start();
        }
    }

    static class DownloadingTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Inside downloading task : " + Thread.currentThread().getName());
        }
    }
}
