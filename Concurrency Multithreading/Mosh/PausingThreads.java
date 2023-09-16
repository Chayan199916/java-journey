public class PausingThreads {
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
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println("Downloading task finished : " + Thread.currentThread().getName());
        }
    }
}
/**
 * so all threads started at the same time and finished at the same time after 5
 * seconds. If it was a single threaded application, it would have taken 5 * 10
 * = 50 seconds but in multithreaded application, only 5 seconds. if numbr of
 * tasks are more, jvm has it's own thread scheduler which gives a slice of cpu
 * time to each thread and it gives a illusion that they are running in
 * parallel.
 */
