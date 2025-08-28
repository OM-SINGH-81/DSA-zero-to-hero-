import java.util.*;

public class DoubleSidedArrow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        int star = 1;
        int row = 1;
        int space2 = -1;
        int val = 1;
        while (row <= n) {
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j <= star) {
                System.out.print(val + " ");
                if (j != star) {
                    val--;
                }
                j++;
            }
            int k = 1;
            while (k <= space2) {
                System.out.print("  ");
                k++;
            }
            int p = 1;
            if (row == 1 || row == n) {
                p = 2;
                val++;
            }
            while (p <= star) {
                System.out.print(val + " ");
                val++;
                p++;
            }
            if (row <= (n / 2)) {
                space -= 2;
                star++;
                space2 += 2;
            } else {
                space += 2;
                star--;
                (space2) -= 2;
                val -= 2;
            }
            row++;

            System.out.println();
        }
    }
}