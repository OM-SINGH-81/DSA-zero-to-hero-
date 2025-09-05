import java.util.*;

public class RunningSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = runningSum(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] runningSum(int[] arr) {
        int n = arr.length;
        int result[] = new int[n];
        result[0] = arr[0];
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + arr[i];
        }
        return result;
    }
}
