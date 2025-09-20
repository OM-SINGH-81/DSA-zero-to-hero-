import java.util.Scanner;
 public class Maximum_circular_sum {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        int t = name.nextInt();
        while (t-- > 0) {
            int n = name.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++)
                arr[i] = name.nextInt();

            System.out.println(subarray(arr));
        }
    }

    public static int subarray(int[] arr) {
		int totalsum=0;
		int ansmax=Integer.MIN_VALUE;
		int ansmin=Integer.MAX_VALUE;
		int max= 0;
		int min=0;
		for (int i = 0; i < arr.length; i++) {
			max+=arr[i];
			min+=arr[i];
			ansmax=Math.max(max, ansmax);
			ansmin=Math.min(min, ansmin);
			
			totalsum+=arr[i];
			if(max<0) {
				max=0;
			}
			if(min>0) {
				min=0;
			}
			
		}
		if(ansmax<0) return ansmax;
		return Math.max(totalsum-ansmin,ansmax);
		
	}

}
