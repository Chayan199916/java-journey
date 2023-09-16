import java.util.List;
import java.util.ArrayList;

public class RaceCondition {
    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();
        List<Thread> threads = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadingTask(status));
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println(status.getBytesDownloaded());
    }

    static class DownloadStatus {
        private int bytesDownloaded;

        public int getBytesDownloaded() {
            return bytesDownloaded;
        }

        public void incrementBytesDownloaded() {
            bytesDownloaded++;
        }
    }

    static class DownloadingTask implements Runnable {
        private DownloadStatus status;

        public DownloadingTask(DownloadStatus status) {
            this.status = status;
        }

        @Override
        public void run() {
            System.out.println("Inside downloading task : " + Thread.currentThread().getName());
            for (int i = 0; i < 10_000; i++) {
                status.incrementBytesDownloaded();
            }
        }
    }
}
/*
 * A race condition occurs when multiple threads concurrently access and modify
 * shared data without proper synchronization, leading to unpredictable and
 * potentially incorrect results. In this code:
 * 
 * Ten threads are created, each running a DownloadingTask.
 * Each DownloadingTask increments the bytesDownloaded counter inside a loop
 * without any explicit synchronization mechanism.
 * Since multiple threads are modifying the bytesDownloaded counter
 * concurrently, a race condition may occur.
 * The result of status.getBytesDownloaded() in the main method may not be equal
 * to the expected total (10 threads * 10,000 increments), as there is no
 * synchronization to ensure that increments are atomic and correctly reflected
 * in the shared DownloadStatus object.
 */