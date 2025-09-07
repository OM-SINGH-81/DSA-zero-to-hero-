public class leetTwoSumII {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int left = 1;
        int right = nums.length;
        int sum = 0;
        while (left < right) {
            sum = nums[left - 1] + nums[right - 1];
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null;

    }
}
