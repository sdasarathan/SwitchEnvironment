/**
 * Created by sdasa on 11/18/2016.
 */
public class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Running run 2");
        MyPojo myPojo = MyPojo.getInstance();
        synchronized (this){
            myPojo.setB(myPojo.getA()+1);
        }
    }
}
