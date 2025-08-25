import java.util.*;

public class PatternNumberLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int val = 1;

        while (row <= n) {

            int j = 1;
            while (j <= star) {
                System.out.print(val + "\t");
                j++;
                val++;

            }
            row++;
            star++;
            System.out.println();
        }
    }
}
