public class LeetMissingElement {
    public static void main(String[] args) {
        int arr[]={ 0, 1};
                                                                                         int result=MissingElement(arr);
        System.out.println(result);
    }
    public static int MissingElement(int [] arr) {
        int n=arr.length;
        int sn=(n*(n+1))/2;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sn-sum;

    }
}

