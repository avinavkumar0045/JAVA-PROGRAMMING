public class thr2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running...");
    }
}