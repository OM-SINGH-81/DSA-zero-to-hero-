public class BuySellStock {
    public static void main(String[] args) {
        int [] arr={ 7, 6, 4, 3, 1};
        System.out.println(profit(arr));
    }
    public static int profit(int[] arr) {
       int maxProfit=0;
       int minimum=arr[0];
       for (int i = 0; i < arr.length; i++) {
        minimum=Math.min(minimum,arr[i]);
        int profit=arr[i]-minimum;
        maxProfit=Math.max(maxProfit, profit);
       }
       return maxProfit;

    }
}
