import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ishappy(n));
    }
    public static boolean ishappy(int n) {
        if (n == 1)
            return true; // happy
        if (n == 4)
            return false; // unhappy cycle

        return ishappy(sumOfSquares(n));
    }

    private static int sumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num = num / 10;
        }
        return sum;
        
    }
}
