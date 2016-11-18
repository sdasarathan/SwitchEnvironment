/**
 * Created by sdasa on 11/18/2016.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Running in the run method");
        MyPojo myPojo = MyPojo.getInstance();
        synchronized (this){
            myPojo.setB(myPojo.getA() - 1);
        }
    }
}
