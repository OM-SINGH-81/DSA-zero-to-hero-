import java.util.*;

public class Replace_0_with_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long rep = 0;
        while (n > 0) {
            long rem = n % 10;
            if (rem == 0) {
                rem = 5;
            }
            rep = rep * 10 + rem;
            n /= 10;
        }
        long result = reversed(rep);
        System.out.println(result);
    }

    public static long reversed(long n) {
        if (n == 0) {
            return 5;
        }
        long rev = 0;
        while (n > 0) {
            long rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;

    }

}