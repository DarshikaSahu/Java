

public class Modifiers {
    int x;
    private int y;
    protected int z;
    public int a;


    void print(){
        x = 11;
        y = 44;
        z = 445;
        a = 45;
    }
}

class Abc{
    void show(){
        Modifiers m = new Modifiers();
        m.x = 22;
        //m.y = 11;      ---> cannot call private variable in other class  
        m.z = 55;
        m.a = 12;
    }
}
