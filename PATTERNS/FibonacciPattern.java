import java.util.*;

public class FibonacciPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int row = 1;
        int star = 1;

        int a = 0, b = 1;
        while (row <= n) {
            int i = 0;
            while (i < star) {
                System.out.print(a + "\t");
                int next = a + b;
                a = b;
                b = next;
                i++;
            }
            row++;
            star++;
            System.out.println();

        }
    }
}
