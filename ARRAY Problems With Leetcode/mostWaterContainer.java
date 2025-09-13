import java.util.Scanner;

public class mostWaterContainer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] height=new int [n];
        for (int i = 0; i < n; i++) {
            height[i]=sc.nextInt();
        }
        int result=maxArea(height);
        System.out.println(result);
    }
    
    public static int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxx = 0;
        while (l < r) {
            int lh = height[l];
            int rh = height[r];
            int w = r - l;
            int minh = Math.min(lh, rh);
            int curwater = minh * w;
            maxx = Math.max(maxx, curwater);
            if (lh < rh)
                l++;
            else
                r--;
        }
        return maxx;
    }
}
