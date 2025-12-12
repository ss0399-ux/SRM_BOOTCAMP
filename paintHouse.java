public class Main
{
    static class Solution {
        public int minCost(int[][] costs) {
            if(costs == null || costs.length == 0) return 0;
            
            return helper(costs, 0, -1);
        
        }
        private int helper(int[][] costs, int idx, int prevColor) {
            int n = costs.length;
            
            if(idx == n) return 0;
            
            int min = Integer.MAX_VALUE;
            for(int color = 0; color < 3; color++) {
                if(color == prevColor) continue;
                
                int cost = costs[idx][color] + helper(costs, idx + 1, color);
                
                min = Math.min(min, cost);    
            }
            return min;
        }
    }
	public static void main(String[] args) {
		int[][] costs = {
		    {1, 2, 3 },
		    {1, 4, 6}
		    
		};
		Solution sol = new Solution();
		int result = sol.minCost(costs);
		System.out.println(result);
	}
}
