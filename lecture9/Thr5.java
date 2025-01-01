public class Thr5 implements Runnable {
    Thread t;

    public Thr5(){
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("testing new away");

                Thread.sleep(2000);
            }
        } catch (Exception e) {
        }
    }
}
