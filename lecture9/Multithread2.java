public class Multithread2 {
    public static void main(String[] args) {
        Thr2 r = new Thr2();
        Thr3 r1 = new Thr3();

        r.start();  //start calls run method
        r1.start();

        Thr5 y = new Thr5();
    }
}
