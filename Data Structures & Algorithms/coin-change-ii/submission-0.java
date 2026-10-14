class Solution {
    public int coins(int amount,int[] coins,int n) {
        int [][] t= new int[n+1][amount+1];
        for (int i=0;i<=n;i++) {
            t[i][0] = 1;
        }
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=amount;j++) {
                if (j>=coins[i-1]) {
                    t[i][j] = t[i][j-coins[i-1]] + t[i-1][j];
                }
                else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][amount];
    }
    public int change(int amount, int[] coins) {
        int n = coins.length;

        return coins(amount,coins,n);
    }
}
