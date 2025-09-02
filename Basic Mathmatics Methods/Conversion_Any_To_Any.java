import java.util.*;

public class Conversion_Any_To_Any {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sb = sc.nextInt();
        int db = sc.nextInt();
        int sn = sc.nextInt();

        int decimal = anyBaseToDecimal(sn, sb);
        int result = decimalToAnyBase(decimal, db);

        System.out.println(result);
    }

    public static int anyBaseToDecimal(int sn, int sb) {
        int decimal = 0;
        int power = 1;

        while (sn > 0) {
            int digit = sn % 10;
            decimal += digit * power;
            power *= sb;
            sn /= 10;
        }

        return decimal;
    }

    public static int decimalToAnyBase(int decimal, int db) {
        int result = 0;
        int power = 1;

        while (decimal > 0) {
            int digit = decimal % db;
            result += digit * power;
            power *= 10;
            decimal /= db;
        }

        return result;
    }
}