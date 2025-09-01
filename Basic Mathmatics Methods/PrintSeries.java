import java.util.*;

public class PrintSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int count = 0;
        int n = 1;
        while (count < n1) {
            int term = 3 * n + 2;
            if (term % n2 != 0) {
                System.out.println(term);
                count++;
            }
            n++;
        }

    }

}