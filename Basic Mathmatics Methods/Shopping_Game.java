// Faculty at CodingBlocks loves to purchase smartphones and decides to play a game. Aayush and Harshit decides to shop for smartphones. Aayush purchases 1 smartphone, then Harshit purchases 2 smartphones, then Aayush purchases 3 smartphones, then Harshit purchases 4 smartphones, and so on. Once someone can't purchase more smartphones, he loses.

// Aayush can purchase at most M smartphones and Harshit can purchase at most N smartphones. Who will win ? Print "Aayush" and "Harshit" accordingly.


// Input Format
// The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows. Two integers M and N denoting the maximum possible number of smartphones Aayush and Harshit can purchase respectively.


// Constraints
// 1 ≤ T ≤ 1000 1 ≤ M, N ≤ 10^6


// Output Format
// For each test case, output a single line containing one string — the name of the winner i.e. Aayush or Harshit


// Sample Input
// 2
// 9 3    
// 8 11
// Sample Output
// Aayush
// Harshit

import java.util.*;

public class Shopping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {

            int m = sc.nextInt();
            int n = sc.nextInt();
            int a = 0;
            int h = 0;
            int phone = 1;
            while (true) {
                a = a + phone;
                if (a > m) {
                    System.out.println("Harshit");
                    break;
                }
                phone++;
                h = h + phone;
                if (h > n) {
                    System.out.println("Aayush");
                    break;
                }
                phone++;
            }
            t--;
        }
        sc.close();

    }
}