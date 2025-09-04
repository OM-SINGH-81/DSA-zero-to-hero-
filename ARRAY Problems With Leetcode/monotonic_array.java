public class monotonic_array {
    public static void main(String[] args) {
        int arr[]={ 1, 2, 2, 3};
        System.out.println(isMonotonic(arr));
    }
    public static boolean isMonotonic(int [] arr){
       boolean increasing = true;
       boolean decreasing =true;
       for (int i = 1; i < arr.length; i++) {
        if (arr[i]<arr[i-1]) increasing = false;
        if (arr[i]>arr[i-1]) decreasing =false;
       }
       return increasing || decreasing;
    }
    }

