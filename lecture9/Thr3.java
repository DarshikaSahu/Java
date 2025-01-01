public class Thr3 {
    public void run(){
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}
