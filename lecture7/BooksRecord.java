
import java.util.HashSet;
import java.util.Set;

public class BooksRecord {
    public static void main(String[] args) {
        Books b = new Books(2300, "java", "2323434");
        Books b1 = new Books(1300, "C", "1324434");
        Books b2 = new Books(2900, "C++", "2325434");
        Books b3 = new Books(3000, "PHP", "134434");
        System.out.println(b);   // toString print reference

        Set<Books> s = new HashSet<>();
        s.add(b);
        s.add(b1);
        s.add(b2);
        s.add(b3);
        s.remove(b1);
        s.remove(b2);
        System.out.println(s);
    }
}
