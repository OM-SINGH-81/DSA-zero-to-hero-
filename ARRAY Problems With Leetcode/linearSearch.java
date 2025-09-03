public class linearSearch {
    public static void main(String[] args) {
        int [] arr ={10,3,4,6,7,9};
        int item=6;
       int outt= Search(arr, item);
       System.out.println(outt);
    }
    public static int Search(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
}
