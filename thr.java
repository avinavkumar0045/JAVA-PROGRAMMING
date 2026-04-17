public class thr {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        MyThread t3 = new MyThread();

      
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t2);



        thread1.start();
        thread2.start();

        t3.setName("Worker-1");
    }
}

class MyThread extends Thread{
    public void run(){
        System.out.println("Thread Running "+getName());
    }
}

class Task1  implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++) {       
            System.err.println("Task-1 "+ i);
        }
    }
}


class Task2 implements Runnable {
    public void run(){
        for (int i = 1; i <= 5; i++) {       
            System.err.println("Task-2 "+ i);
        }
    }
}
