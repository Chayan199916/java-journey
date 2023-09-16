public class JoiningThreads {
    public static void main(String[] args) {
        System.out.println("Inside main thread : " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadingTask());
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                // TODO: handle exception
            }
            System.out.println("File is ready to be scanned : " + Thread.currentThread().getName());
        }
        System.out.println("All tasks done : " + Thread.currentThread().getName());
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
 * The main thread starts 10 worker threads inside the loop.
 * 
 * After starting each worker thread, it immediately calls thread.join(). This
 * means that the main thread will wait for each worker thread to complete its
 * execution before proceeding to the next iteration of the loop.
 * 
 * As a result, the main thread will be blocked while waiting for each worker
 * thread to finish one by one. It will only proceed to the next iteration of
 * the loop (and therefore start the next worker thread) once the current worker
 * thread has completed.
 * 
 * This blocking behavior continues for all 10 worker threads, so the main
 * thread will be blocked until all of them have finished executing.
 */