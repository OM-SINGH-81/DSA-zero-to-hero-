public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int []arr={0,0,1,1,1,2,2,3,3,4};
        int result=removeDuplicates(arr);
        for (int i = 0; i < result; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int removeDuplicates(int[] arr) {
         
            int k=1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]!=arr[i-1]) {
                    arr[k] = arr[i];
                    k++;
                }
            }return k;
            

        }
    }

