import java.util.Scanner;

public class PatternHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 0;
        int space = 0;
        int star = n;

        while (row < 2 * n + 1) {
            int i = 0;
            while (i < space) {
                System.out.print("  ");
                i++;
            }

            int val = star;
            int j = 0;
            while (j < star + 1) {
                System.out.print(val + " ");
                val--;
                j++;
            }

            val = 1;
            int k = 0;
            while (k < star) {
                System.out.print(val + " ");
                val++;
                k++;
            }

            System.out.println();

            if (row < n) {
                space++;
                star--;
            } else {
                space--;
                star++;
            }
            row++;
        }
    }
}
