class Solution {
    public static int max(int range, int grid[][], int row, int col) {
        int maximum_value = 0;
        for(int i=row; i<row+3; i++) { 
            for(int j=col; j<col+3; j++) {
                if (maximum_value < grid[i][j]) 
                    maximum_value = grid[i][j];
            }
        }
        return maximum_value;
    }

    public int[][] largestLocal(int[][] grid) {
        int range      = grid.length - 2;
        int answer[][] = new int[range][range];
        for(int i=0;i<range;i++) {
            for(int j=0;j<range;j++) { answer[i][j] = max(range, grid, i,j); }
        }
        return answer;
    }
}