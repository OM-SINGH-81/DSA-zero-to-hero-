import java.util.*;

public class DeepakAndRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] prices = new int[N];
            for (int i = 0; i < N; i++) {
                prices[i] = sc.nextInt();
            }
            int M = sc.nextInt();

            Arrays.sort(prices);

            int left = 0, right = N - 1;
            int rose1 = 0, rose2 = 0;
            int minDiff = Integer.MAX_VALUE;

            while (left < right) {
                int sum = prices[left] + prices[right];

                if (sum == M) {
                    int diff = prices[right] - prices[left];
                    if (diff < minDiff) {
                        minDiff = diff;
                        rose1 = prices[left];
                        rose2 = prices[right];
                    }
                    left++;
                    right--;
                } else if (sum < M) {
                    left++;
                } else {
                    right--;
                }
            }

            System.out.println("Deepak should buy roses whose prices are "
                    + rose1 + " and " + rose2 + ".");
            System.out.println(); // blank line after each test case
        }
    }
}
