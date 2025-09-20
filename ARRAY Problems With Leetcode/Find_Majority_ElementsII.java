 import java.io.*;
import java.util.*;

public class Find_Majority_ElementsII {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int num1 = 0, num2 = 0;
        int c1 = 0, c2 = 0;
        for (int x : arr) {
            if (x == num1) c1++;
            else if (x == num2) c2++;
            else if (c1 == 0) { num1 = x; c1 = 1; }
            else if (c2 == 0) { num2 = x; c2 = 1; }
            else { c1--; c2--; }
        }
        c1 = 0; c2 = 0;
        for (int x : arr) {
            if (x == num1) c1++;
            else if (x == num2) c2++;
        }

        boolean printed = false;
        if (c1 > n / 3 && c2 > n / 3) {
            if (num1 < num2) System.out.println(num1 + " " + num2);
            else System.out.println(num2 + " " + num1);
            printed = true;
        } else if (c1 > n / 3) {
            System.out.println(num1);
            printed = true;
        } else if (c2 > n / 3) {
            System.out.println(num2);
            printed = true;
        }

        if (!printed) System.out.println("No Majority Elements");
    }
}