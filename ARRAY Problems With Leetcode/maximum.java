public class maximum {
    public static void main(String[] args) {
        int[] arr={2,4,7,9,8};
        System.out.println((maximum(arr)));
    }
 public static int maximum(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i]>max){
            max=arr[i];
        }
    }return max;
    
    
    
    ;
}
}

// int max = Integer.MIN_VALUE;for(
// int i = 0;i<arr.length;i++)
// {
//         if (arr[i]>max){
//             max=Math.max(max,arr[i]);
//         }
//     }return max
