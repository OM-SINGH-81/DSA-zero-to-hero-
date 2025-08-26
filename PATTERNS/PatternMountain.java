import java.util.*;

public class PatternMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = 2 * n - 3;

        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print(i + "\t");
                i++;
            }
            int j = 1;
            while (j <= space) {
                System.out.print("\t");
                j++;
            }
            int k = star;
            if (row == n) {
                k = star - 1;
            }
            while (k >= 1) {
                System.out.print(k + "\t");
                k--;
            }
            row++;
            star++;
            space -= 2;
            System.out.println();

        }
    }
}
