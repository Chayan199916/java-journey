public class ConcurrentExecutionUsingJoin {
    public static void main(String[] args) {
        System.out.println("Inside main thread: " + Thread.currentThread().getName());

        // Create an array to hold references to the worker threads
        Thread[] threads = new Thread[10];

        // Start the worker threads
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new DownloadingTask());
            threads[i].start();
        }

        // Continue doing other work concurrently with the worker threads
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("Main thread is working on other tasks...");
        }

        // Join all the worker threads after they have been started
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All tasks done: " + Thread.currentThread().getName());
    }

    static class DownloadingTask implements Runnable {
        @Override
        public void run() {
            System.out.println("Inside downloading task: " + Thread.currentThread().getName());
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Downloading task finished: " + Thread.currentThread().getName());
        }
    }
}
/**
 * The main thread starts all the worker threads in a loop and continues to
 * perform other tasks concurrently within the same loop.
 * 
 * After starting all the worker threads, it joins them in a separate loop. This
 * ensures that the main thread waits for all worker threads to finish but still
 * allows the main thread to execute its own tasks in parallel with the worker
 * threads.
 * 
 * This way, the main thread doesn't block while waiting for the worker threads
 * to complete, achieving concurrent execution of tasks.
 */
