public class Projection_Area_of_3D_Shapes {
    public static void main(String[] args) {
        int[][] grid = new int[][] {{1,2}, {3,4}};
        
        // top-view
        int top_view = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if (grid[i][j] >= 1) { top_view+=1; }
            }
        }
        
        int row_max = 0; // front-view
        int col_max = 0; // side-view
        for(int i=0; i<grid.length; i++) {
            int temp1 = 0;
            int temp2 = 0;
            for(int j=0; j<grid[0].length; j++) {
                if (grid[i][j] > temp1) {temp1 = grid[i][j];}
                if (grid[j][i] > temp2) {temp2 = grid[j][i];}
            }
            row_max+=temp1;
            col_max+=temp2;
        }
        
        int total_area = top_view + row_max + col_max;
        
    }
}
