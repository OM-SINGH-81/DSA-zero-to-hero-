public class second_and_thirdLargest {
    public static void main(String[] args) {
        int arr[]={3,6,9,7,4,8};
        int result=SecondAndThird(arr);
        System.out.println(result);

    }public static int SecondAndThird(int[]arr) {
        int fl=Integer.MIN_VALUE;
        int  sl= Integer.MIN_VALUE;
        int tl = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>fl){
                tl=sl;
                sl=fl;
                fl=arr[i];
            }
            else if (arr[i]>sl) {
                tl=sl;
                sl=arr[i];
            }
            else if (arr[i]>tl) {
                tl=arr[i];
            }
        }
        return tl;    }
}
