public class leettwoSum {
    public static void main(String[] args) {
        int nums []= { 2, 7, 11, 15 };
        int target = 9;
        int[] result = twoSum(nums,target);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

        public static int[] twoSum(int[] nums, int target) {
            int n = nums.length;
            for (int i = 1; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (nums[j] + nums[j - i] == target) {
                        return new int[] { j-i, j };
                    }
                }
            }

            return null;

        }
    }


