import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int result = (dividend * divisor) / gcd(dividend, divisor);
        System.out.println(result);
    }

    public static int gcd(int dividend, int divisor) {
        while (dividend % divisor != 0) {
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }

}