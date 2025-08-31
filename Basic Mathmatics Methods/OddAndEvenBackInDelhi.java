import java.util.*;

public class OddAndEvenBackInDelhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            int car = sc.nextInt();
            int even = 0;
            int odd = 0;

            while (car > 0) {
                int rem = car % 10;
                if (rem % 2 == 0) {
                    even += rem;
                } else {
                    odd += rem;
                }
                car /= 10;
            }

            if (odd % 3 == 0 || even % 4 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

            n--;
        }
    }
}