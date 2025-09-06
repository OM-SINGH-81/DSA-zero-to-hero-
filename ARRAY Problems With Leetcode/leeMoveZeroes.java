public class leeMoveZeroes {
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
    int []result=(move_zeroes(arr));
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i]+" ");
    }

    }public static int[] move_zeroes(int arr[]) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return arr;
        }
        int nz = 0;
        int z = 0;
        while (nz < n) {
            if (arr[nz] != 0) {
                int temp = arr[nz];
                arr[nz] = arr[z];
                arr[z] = temp;
                nz++;
                z++;
            } else {
                nz++;
            }
        }
        return arr;

    }
}
