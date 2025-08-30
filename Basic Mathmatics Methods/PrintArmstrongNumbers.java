import java.util.*;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for (int i = n1; i <= n2; i++) {
            if (Is_armstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean Is_armstrong(int n) {
        int c = count(n);
        int sum = 0;
        int p = n;
        while (n > 0) {
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, c));
            n /= 10;
        }
        return sum == p;
    }

    public static int count(int n) {
        int c = 0;
        while (n > 0) {
            c++;
            n /= 10;
        }
        return c;
    }
}