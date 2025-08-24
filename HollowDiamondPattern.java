import java.util.*;

public class HollowDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n / 2 + 1;
        int space = -1;
        while (row <= n) {
            int i = 1;
            while (i <= star) {
                System.out.print("* \t");
                i++;
            }
            int j = 1;
            while (j <= space) {
                System.out.print("  \t");
                j++;
            }
            int k = 1;
            if (row == 1 || row == n) {
                k = 2;
            }
            while (k <= star) {
                System.out.print("* \t");
                k++;
            }
            if (row < n / 2 + 1) {
                space += 2;
                star--;
            } else {
                space -= 2;
                star++;
            }
            row++;

            System.out.println();
        }
    }
}