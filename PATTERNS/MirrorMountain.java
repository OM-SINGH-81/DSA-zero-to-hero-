import java.util.*;

public class MirrorMountain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = -1;
        while (row <= 2 * n - 1) {
            int i = 1;
            while (i <= star) {
                System.out.print("*");
                i++;
            }
            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }
            int k = 1;
            if (row == 1 || row == 2 * n - 1) {
                k = 2;
            }
            while (k <= star) {
                System.out.print("*");
                k++;
            }
            if (row < n) {
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