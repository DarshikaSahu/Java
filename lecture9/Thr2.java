public class Thr2 extends Thread {
    public void run(){
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("welcome");
                Thread.sleep(2000);
            }
        }catch(Exception e){}
    }
}
