import java.util.*;
public class HelpRamu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();  
        while (T-- > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            int n = sc.nextInt(); 
            int m = sc.nextInt(); 

            int[] rickshaws = new int[n];
            for (int i = 0; i < n; i++) {
                rickshaws[i] = sc.nextInt();
            }

            int[] cabs = new int[m];
            for (int i = 0; i < m; i++) {
                cabs[i] = sc.nextInt();
            }

            
            int rickshawCost = 0;
            for (int rides : rickshaws) {
                rickshawCost += Math.min(rides * c1, c2);
            }
            rickshawCost = Math.min(rickshawCost, c3);

            
            int cabCost = 0;
            for (int rides : cabs) {
                cabCost += Math.min(rides * c1, c2);
            }
            cabCost = Math.min(cabCost, c3);

            // final cost
            int totalCost = Math.min(rickshawCost + cabCost, c4);

            System.out.println(totalCost);
        }
}
}