import java.util.*;

public class Chewbacca_and_Number {

    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        long n = name.nextLong();
        long place = 1, rem, sum = 0;
        long c = count(n);
        while (n > 0) {
            rem = n % 10;
            if (9 - rem < rem) {
                if (c == 1 && rem == 9) {
                    rem = 9;
                } else {
                    rem = 9 - rem;
                }
            }
            sum = sum + rem * place;
            place *= 10;
            n = n / 10;
            c--;
        }
        System.out.print(sum);
    }

    public static long count(long n) {
        long c = 0;
        while (n > 0) {
            c++;
            n = n / 10;
        }
        return c;
    }

}