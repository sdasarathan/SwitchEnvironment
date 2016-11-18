/**
 * Created by sdasa on 11/18/2016.
 */
public class NyThread {

    public NyThread() {

    }

    public static void  main(String[] args) throws InterruptedException {
        System.out.println("Starting main");
        MyPojo.getInstance().setA(10);

        createThread(new MyRunnable2());
        createThread(new MyRunnable2());
        createThread(new MyRunnable());

    }
    static void createThread(Runnable rb) throws InterruptedException {
        Thread myThread = new Thread(rb);
        myThread.start();
        System.out.println("B"+MyPojo.getInstance().getB());
        //Thread.sleep(3000);
    }
}
