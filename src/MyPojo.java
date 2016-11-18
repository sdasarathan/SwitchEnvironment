/**
 * Created by sdasa on 11/18/2016.
 */
public class MyPojo {
private int a;
private int b;

    private static MyPojo instance = null;
    protected MyPojo() {
        // Exists only to defeat instantiation.
    }
    public static MyPojo getInstance() {
        if(instance == null) {
            instance = new MyPojo();
        }
        return instance;
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
