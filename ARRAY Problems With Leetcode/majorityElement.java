class Solution {
    public int majorityElement(int[] nums) {
        int fre = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == fre) {

                count++;
            } else {

                count--;
                if (count == 0) {

                    fre = nums[i];
                    count = 1;
                }
            }
        }

        return fre;
    }
}
