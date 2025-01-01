
public class CallingBanner implements Runnable {

    Thread t;
    String msg;
    Banner b;

    public CallingBanner(Banner r, String m) {
        msg = m;
        b = r;
        t = new Thread(this);
        t.start();
    }

    public void main() {
        synchronized (b) {
            b.call(msg);
        }
    }

}
