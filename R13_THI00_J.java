public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

MyThread myThread = new MyThread();
myThread.run(); // This invokes the method directly, not in a new thread
