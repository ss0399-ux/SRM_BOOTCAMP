class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n = grid.length;
        int nSquare = n * n;

        long expectedSum = (long) nSquare * (nSquare + 1) / 2;
        long expectedSumSquare = (long) nSquare * (nSquare + 1) * (2 * nSquare + 1) / 6;

        long actualSum = 0;
        long actualSumSquare = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                actualSumSquare += (long) grid[i][j] * grid[i][j];
            }
        }

        // find a^2 - b^2
        long differenceSumSquares = actualSumSquare - expectedSumSquare;

        // find a - b
        long differenceSum = actualSum - expectedSum;

        // find a + b = (a^2 - b^2) / (a - b)
        long sumAB = differenceSumSquares / differenceSum;

        // find a and b
        int a = (int) ((sumAB + differenceSum) / 2);
        int b = (int) ((sumAB - differenceSum) / 2);

        return new int[]{a, b};
    }
}
