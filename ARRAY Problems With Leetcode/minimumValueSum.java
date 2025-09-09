public class minimumValueSum {
    public static void main(String[] args) {
        int [] arr={-3,2,-3,4,2};
        System.out.println(minimumSum(arr));
    }
    
    public static int minimumSum(int[] arr) {
        int sum = 0;
        int min = 0; 

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            min = Math.min(min, sum);
        }

        return 1 - min; 
    }

}
