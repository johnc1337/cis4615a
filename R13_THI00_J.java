public class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

MyThread myThread = new MyThread();
myThread.start(); // Correctly starts a new thread
