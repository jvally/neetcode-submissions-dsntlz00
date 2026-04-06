class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] mem = new int[n + 1];
        
        for (int i = 2; i <= n; i++) {
            mem[i] = Math.min(mem[i - 1] + cost[i -1],
            mem[i - 2] + cost[i - 2]);
        }
        

        return mem[n];
    }
}
