import java.util.*;
public class array {
    public static void main(String[] args) {
    //  Scanner sc =new Scanner(System.in);
    //  int n= sc.nextInt();
    //  int [] arr =new int[n];
    //  for (int i = 0; i < arr.length; i++) {
    //    arr[i]=sc.nextInt(); 
    int[]arr={10,20,30,40,50};
    int[] other = { 1,2,3,4,5 };
    System.out.println(arr[0] + " " + other[0]);

    int temp[]=arr;
    arr=other;
    other=temp;
    // swap(arr,other);
    System.out.println(arr[0]+" "+other[0]);
     }
    //  Display(arr);
        
    
    public static void swap(int[] arr,int[] other) {
        int[] temp =arr;
        arr=other;
        other=temp;
        
    }

}