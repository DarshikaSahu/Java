// Q 10 Rajan  went to a movie with his friends in a multiplex theatre and during  break time he bought pizzas, puffs and cool drinks. Consider   the following prices :

// Rs.100/pizza
// Rs.20/puffs
// Rs.10/cooldrink
// Generate a bill for What Rajan  has bought.
// Sample Input 1:
// Enter the no of pizzas bought:10
// Enter the no of puffs bought:12
// Enter the no of cool drinks bought:5
// Sample Output 1:
// Bill Details
// No of pizzas:10
// No of puffs:12
// No of cooldrinks:5
// Total price=1290
import java.util.Scanner;

class multiplex {

    Scanner s = new Scanner(System.in);
    int pizza;
    int puff;
    int cooldrink;
    int total;
    static int pizza_price = 100;
    static int puff_price = 20;
    static int cooldrink_price = 10;

    void setData() {
        System.out.println("Enter the no of pizzas bought: ");
        pizza = s.nextInt();
        System.out.println("Enter the no of puffs bought: ");
        puff = s.nextInt();
        System.out.println("Enter the no of cooldrinks bought: ");
        cooldrink = s.nextInt();
    }

    void getData() {
        System.out.println("Bill Details: ");
        System.out.println("No of pizzas bought: " + pizza);
        System.out.println("No of puffs bought: " + puff);
        System.out.println("No of cooldrinks bought: " + cooldrink);
        System.out.println("Total price= " + (pizza * pizza_price + puff * puff_price + cooldrink * cooldrink_price));
    }

}

public class Que10 {

    public static void main(String[] args) {
        multiplex m = new multiplex();
        m.setData();
        m.getData();
    }

}
