import java.util.*;

public class Boston_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (primefactors(n) == sumOfDigit(n)) {

            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }

    public static long primefactors(long n) {
        long sum = 0;
        for (long i = 2; i <= n; i++) {
            while (n % i == 0) {
                sum += sumOfDigit(i);
                n = n / i;
            }
        }
        return sum;
    }

    public static long sumOfDigit(long n) {
        long sum = 0;
        while (n > 0) {
            long rem = n % 10;
            sum += rem;
            n /= 10;
        }
        return sum;
    }
}