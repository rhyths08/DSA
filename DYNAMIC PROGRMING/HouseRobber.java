public class HouseRobber {
    public static int maxProfit(int houses[]) {
        int[] dp = new int[houses.length];
        for(int i=0;i<dp.length;i++) {
            dp[i] = 0;
        }
        System.out.println(houses.length);
        return maxProfit(houses, 0, dp);
    }
    private static int maxProfit(int houses[], int currentHouse, int dp[]) {
        if(currentHouse >= houses.length)
            return 0;
        else {
            if(dp[currentHouse] == 0) {
                int stealFirstHouse = houses[currentHouse] + maxProfit(houses, currentHouse+2, dp);
                int skipForstHouse = maxProfit(houses, currentHouse+1, dp);
                dp[currentHouse] = Math.max(stealFirstHouse, skipForstHouse);
            }
            return dp[currentHouse];
        }
    }
    public static void main(String[] args) {
        int[] houses = {6,7,1,30,8,2,4};
        System.out.println(maxProfit(houses));
    }
}
