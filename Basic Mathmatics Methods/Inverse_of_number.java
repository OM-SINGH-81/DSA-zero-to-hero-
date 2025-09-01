import java.util.*;

public class Inverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(Inverse(n));
    }

    public static int Inverse(int n) {
        int place = 1;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = (int) (sum + place * Math.pow(10, rem - 1));
            place++;
            n /= 10;
        }
        return sum;
    }
}