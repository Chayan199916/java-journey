import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;

public class LockDemo {
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
        private Lock lock = new ReentrantLock();

        public int getBytesDownloaded() {
            return bytesDownloaded;
        }

        public void incrementBytesDownloaded() {
            lock.lock();
            try {
                bytesDownloaded++;
            } finally {
                lock.unlock();
            }
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