package Day10;

public class ThreadDemo implements Runnable {

    Thread t;

    ThreadDemo() {
        t = new Thread(this, "Demo1");
        System.out.println("Child thread " + t);
        t.start();

    }

    public void run() {
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Child thread: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Child thread is exixting");

    }
}
