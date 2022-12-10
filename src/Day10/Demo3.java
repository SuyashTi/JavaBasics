package Day10;

public class Demo3 implements Runnable{

    String threadName;
    Thread t;

    Demo3(String threadName){
        this.threadName = threadName;
        t=new Thread(this,this.threadName);
        System.out.println("Created thread "+t);
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

}
    }
