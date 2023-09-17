import java.util.List;
import java.util.ArrayList;

public class ConfinementDemo {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<Thread>();
        List<DownloadingTask> tasks = new ArrayList<DownloadingTask>();
        /**
         * In this loop, 10 DownloadingTask instances are created, and each of them is
         * executed concurrently in a separate thread. These threads run their
         * respective DownloadingTask instances in parallel, allowing multiple downloads
         * to occur simultaneously.
         */
        for (int i = 0; i < 10; i++) {
            DownloadingTask task = new DownloadingTask();
            tasks.add(task);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }
        /**
         * This part ensures that the program waits for all threads to complete before
         * proceeding further. However, the actual execution of the DownloadingTask
         * instances happens concurrently in multiple threads.
         */
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println(tasks.stream()
                .mapToInt((task) -> task.getStatus().getBytesDownloaded())
                .reduce(0, (task1, task2) -> task1 + task2));
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

        public DownloadingTask() {
            this.status = new DownloadStatus();
        }

        @Override
        public void run() {
            System.out.println("Inside downloading task : " + Thread.currentThread().getName());
            for (int i = 0; i < 10_000; i++) {
                status.incrementBytesDownloaded();
            }
        }

        public DownloadStatus getStatus() {
            return status;
        }
    }
}
/**
 * The main concept demonstrated here is thread confinement, where each thread
 * works with its own local state (in this case, its own DownloadStatus object),
 * preventing data corruption or interference between threads. The program
 * prints the total number of bytes downloaded by all tasks once they have
 * completed their work.
 */