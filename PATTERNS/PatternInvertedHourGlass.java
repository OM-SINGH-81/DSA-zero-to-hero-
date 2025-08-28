import java.util.*;

public class PatternInvertedHourGlass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 2 * n - 1;
        int star = 1;
        int val = n;
        while (row <= 2 * n + 1) {
            // star
            int i = 1;
            while (i <= star) {
                System.out.print(val + " ");
                i++;
                val--;
            }
            // space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }
            // star
            int k = 1;
            if (row == n + 1) {
                val++;
                k = 2;
            }
            while (k <= star) {
                val++;
                System.out.print(val + " ");
                k++;
            }
            if (row <= n) {
                space -= 2;
                star++;
            } else {
                space += 2;
                star--;
            }
            row++;
            System.out.println();
        }
    }
}