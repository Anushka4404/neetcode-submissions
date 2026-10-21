class Solution {
    private Map<String,Integer>memo;
    public int dfs(int[] prices,int i,boolean buying) {
        int n = prices.length;

        if (i>=n)  return 0;
        String key = i+"_"+buying;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        int cooldown = dfs(prices,i+1,buying);
        int res;

        if (buying) {
            int buy = dfs(prices,i+1,false)-prices[i];
            res = Math.max(buy,cooldown);
         
        }
        else {
            int sell = dfs(prices,i+2,true)+prices[i];
            res = Math.max(sell,cooldown);
    
        }
        memo.put(key,res);
        return res;
    }
    public int maxProfit(int[] prices) {
        int n = prices.length;
        memo = new HashMap<>();
        return dfs(prices,0,true);
    }
}
