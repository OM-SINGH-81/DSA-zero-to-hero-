public class leetRotateArray {
    // public static void main(String[] args) {
    //     int  arr[]={1,2,3,4,5,6,7};
    //     int k=3;
    //     rotate(arr,k);
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    // public static void rotate(int[] arr,int k) {
    //     int n=arr.length;
    //     k=k%n;
    //     for (int j = 1; j <=k; j++) {
            
    //     int item = arr[n-1];
    //     for (int i = n-2; i >=0; i--) {
    //        arr[i+1]=arr[i]; 
    //     }
    //     arr[0]=item;
    // }
    // }

    // SECOND AND OPTIMISED APPROACH
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        rotate(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
