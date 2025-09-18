import java.util.*;

public class BookAllocationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int nob = sc.nextInt(); // number of books
            int nos = sc.nextInt(); // number of students
            int[] page = new int[nob];

            for (int i = 0; i < nob; i++) {
                page[i] = sc.nextInt();
            }

            System.out.println(Minimumpage(page, nos));
        }
        sc.close();
    }

    public static int Minimumpage(int[] page, int nos) {
        int lo = 0;
        int hi = 0;

        // hi = sum of all pages (worst case: one student reads all books)
        for (int i = 0; i < page.length; i++) {
            hi += page[i];
            lo = Math.max(lo, page[i]); // at least the largest single book
        }

        int ans = hi;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (isitpossible(page, nos, mid)) {
                ans = mid;
                hi = mid - 1; // search for smaller maximum
            } else {
                lo = mid + 1; // need bigger maximum
            }
        }
        return ans;
    }

    public static boolean isitpossible(int[] page, int nos, int mid) {
        int student = 1;
        int readpage = 0;

        for (int i = 0; i < page.length; i++) {
            if (readpage + page[i] <= mid) {
                readpage += page[i];
            } else {
                student++;
                readpage = page[i]; // give current book to next student
                if (student > nos) {
                    return false;
                }
            }
        }
        return true;
    }
}
