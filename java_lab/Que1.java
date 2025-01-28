package java_lab;

// Q1  Given  pairs of rectangles, where each pair denotes the length  and breadth of the  rectangle. The task is to return the
//  maximum area of the rectangle.
// N = 3
// rect[] = {{1,2},
//   {3,4},
//   {5,6}}
class Rectangle {

    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return length * breadth;
    }

}

public class Que1 {

    public static int maxArea(int rect[][], int N) {
        int maxArea = 0;
        for (int i = 0; i < N; i++) {
            Rectangle rectangle = new Rectangle(rect[i][0], rect[i][1]);
            int currentArea = rectangle.area();

            if (currentArea > maxArea) {
                maxArea = currentArea;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int rect[][] = {{1, 2}, {3, 4}, {5, 6}};
        int N = rect.length;
        int maxArea = maxArea(rect, N);

        System.out.println("Maximum Area: " + maxArea);
    }
}
