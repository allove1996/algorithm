package DP;

import java.util.Arrays;

public class CoinChange {

    public static void main(String[] args) {

    }

    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {

        }
        return 0;
    }
}
