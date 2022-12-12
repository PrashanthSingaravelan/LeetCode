class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        
        for(int i=0; i<grid.length; i++) { // rows
            for(int j=grid[0].length - 1; j>=0; j--) {   // columns --> going from reverse (right to left)
                if (grid[i][j] < 0) cnt+=1; // -ve number
                else  break;   // once a +ve number is seen, it skips further
            }
        }

        return cnt;
    }
}