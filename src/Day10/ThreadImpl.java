package Day10;

public class ThreadImpl {
    public static void main(String[] args){

     //   new ThreadDemo();
     //   new ThreadDemo2();


        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Main thread: " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread");

    }
}
