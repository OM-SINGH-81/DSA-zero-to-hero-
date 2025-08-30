import java.util.*;

public class Fahrenheit_to_Celsius
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fl = sc.nextInt();
        int fh = sc.nextInt();
        int n = sc.nextInt();
        for (int i = fl; i <= fh; i += n) {
            System.out.println(i + "\t" + conversion(i));
        }
    }

    public static int conversion(int n) {
        int cel = (int) ((5.0 / 9) * (n - 32));
        return cel;

    }

}