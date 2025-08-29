import java.util.*;

public class Count_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int result = frequency(n, t);
        System.out.println(result);
    }

    public static int frequency(int n, int t) {
        int count = 0;
        if (n == 0 && t == 0) {
            return 1;
        }
        while (n > 0) {
            int rem = n % 10;
            if (rem == t) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
