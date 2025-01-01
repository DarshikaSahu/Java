public class Method_Overloading {
    void sum(int a, int b){
        System.out.println(a+b);
    }
    
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        Method_Overloading e = new Method_Overloading();
        e.sum(11,12);
    }
}
