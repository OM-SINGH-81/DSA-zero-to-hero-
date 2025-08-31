import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = (binary_to_decimal(n));
        System.out.println(result);
    }

    public static int binary_to_decimal(int n) {
        int sum = 0;
        int mul = 1;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * mul;
            mul *= 2;
            n /= 10;
        }
        return sum;

    }

}