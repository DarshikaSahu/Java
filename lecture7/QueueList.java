
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueList {
    public static void main(String[] args) {            
        //Queue<Integer> r = new LinkedList<Integer>();
        Queue<Integer> r = new PriorityQueue<Integer>();
        r.offer(10);  // offer used to add elements
        r.offer(20);
        r.offer(30);
        System.out.println(r.peek()); // peek to view data

        System.out.println(r); // show non sorted data
        System.out.println(r.poll());
        r.offer(130);
        r.offer(440);
        System.out.println(r.poll());   //null output when queue is empty
    }
}


// priority queue does not work on fifo
//it works on priority -> natural order