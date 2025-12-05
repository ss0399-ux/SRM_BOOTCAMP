class Solution {
    private int minSquares(int n){

        if (n==0) return 0;

        int minCount = Integer.MAX_VALUE;
        for (int i = 1; i*i<=n; i++){
            minCount =Math.min(minCount, 1 + minSquares(n- i*i));
        }
        return minCount;
    }

    public int numSquares(int n) {
        return minSquares(n);
    }
}
