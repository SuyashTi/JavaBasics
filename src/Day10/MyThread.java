package Day10;

//Create 2 threads as FIRST and SECOND the first thread
//calculates and displays table of 5 while the second thread calculates and displays table to 8.
// every iteration of the table should take 2 seconds to display and once the first table is done,
// second table will start only after 5 seconds

public class MyThread implements Runnable {
    String name;
    Thread t;
    MyThread (String thread){


        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }


    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println(name + "Interrupted");
        }
        System.out.println(name + " exiting.");
    }
}


