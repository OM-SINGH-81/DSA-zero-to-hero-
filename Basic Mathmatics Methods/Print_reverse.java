import java.util.*;

public class Print_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = reversed(n);
        System.out.println(result);
    }

    public static int reversed(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;

    }

}