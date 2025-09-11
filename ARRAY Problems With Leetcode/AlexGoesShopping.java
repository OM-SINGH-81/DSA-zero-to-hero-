import java.util.*;
public class AlexGoesShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int q = sc.nextInt(); 

        while (q-- > 0) {
            int A = sc.nextInt(); 
            int k = sc.nextInt(); 

            int count = 0;
            for (int price : prices) {
                if (A % price == 0) {
                    count++;
                }
            }

            if (count >= k) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
}
}