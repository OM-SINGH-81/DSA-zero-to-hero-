import java.util.*;
public class SquaresofaSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sortedSquares(nums);
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        int pos = n - 1; // fill from end

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                ans[pos] = leftSq;
                left++;
            } else {
                ans[pos] = rightSq;
                right--;
            }
            pos--;
        }
        return ans;
    }
}

