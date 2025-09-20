import java.util.*;

public class Calculate_the_sum {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum = (sum + sc.nextLong()) % MOD;
        }

        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++)
            sc.nextInt();

        long power = modPow(2, Q, MOD);
        long result = (sum * power) % MOD;

        System.out.println(result);
    }

    public static long modPow(long base, int exp, int mod) {
        long res=1;
        while (exp>0) {
            if ((exp&1)==1) {
                res =(res*base)%mod;
            }
            base = (base*base)%mod;
            exp >>= 1;
        }
        return res;
    }
}
