import java.util.Scanner;

public class NumberFactor {
    public static int waystoGetNTD(int[] dp, int n) {
        if(n==0 || n==1 || n==2)
            return 1;
        if(n==3)
            return 2;
        if(dp[n] == 0) {
            int sp1 = waystoGetNTD(dp, n-1);
            int sp2 = waystoGetNTD(dp, n-3);
            int sp3 = waystoGetNTD(dp, n-4);
            dp[n] = sp1 + sp2 + sp3;
        }
        return dp[n];
    }

    public static int waystoGetNBU(int dp[], int n) {
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        for(int i=4; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-3] + dp[i-4];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        System.out.println("Using TD Approach: "+waystoGetNTD(dp, n));
        System.out.println("Using BU Approach: "+waystoGetNBU(dp, n));
    }
}
