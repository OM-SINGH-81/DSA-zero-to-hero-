import java.util.*;

public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n - 1;
        int star = n;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while (j <= star) {

                if (j == 1 || row == n || j == n || row == 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
                j++;
            }
            row++;
            space--;

            System.out.println();

        }
    }
}