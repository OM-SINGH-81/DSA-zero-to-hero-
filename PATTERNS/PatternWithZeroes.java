import java.util.*;

public class PatternWithZeroes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;

        while (row <= n) {

            int j = 1;
            while (j <= star) {
                if (j == 1 || j == row) {
                    System.out.print(row + "\t");
                } else {
                    System.out.print("0\t");
                }
                j++;
            }
            row++;
            star++;
            System.out.println();
        }
    }
}