import java.util.*;

public class LeetCountingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ans = countBits(n);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        } 
    }

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            result[i] = result[i >> 1] + (i & 1);
        }

        return result;
    }
}
