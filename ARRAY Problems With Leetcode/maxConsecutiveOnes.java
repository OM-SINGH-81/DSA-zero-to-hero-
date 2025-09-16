public class maxConsecutiveOnes {
public static void main(String[] args) {
   int [] nums = {1,1,0,1,1,1};
   System.out.println(findMaxConsecutiveOnes(nums));
}
        public static int findMaxConsecutiveOnes(int[] nums) {

            int count = 0;
            int maxx = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 1)
                    count++;
                else
                    count = 0;
                maxx = Math.max(count, maxx);
            }
            return maxx;
        }
    }
    
