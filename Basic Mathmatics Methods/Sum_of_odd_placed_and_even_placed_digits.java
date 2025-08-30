import java.util.*;

public class Sum_of_odd_placed_and_even_placed_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        int p = 1;
        while (n > 0) {
            int rem = n % 10;
            if (p % 2 == 1) {
                odd += rem;
            } else {
                even += rem;
            }
            n /= 10;
            p++;
        }
        System.out.println(odd);
        System.out.println(even);
    }

}
