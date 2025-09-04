public static void main(String[] args) {
    int arr[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
    int val = 2;
    int k = Remove(arr, val); 

    System.out.print(k+" ,  ");
    
    
    for (int i = 0; i < k; i++) {
        System.out.print(arr[i] + " ");
    }
}

public static int Remove(int[] arr, int val) {
    int k = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != val) {
            arr[k] = arr[i];
            k++;
        }
    }
    return k; 
}