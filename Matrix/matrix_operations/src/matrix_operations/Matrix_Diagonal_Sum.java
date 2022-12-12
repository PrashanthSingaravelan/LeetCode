package matrix_operations;

public class Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int cnt          = mat[0].length - 1;
        int diagonal_sum = 0;
        
        for(int i=0;i<mat.length;i++) {
            for(int j=0;j<mat[0].length;j++) {
                
                // primary diagonal
                if (i==j) { diagonal_sum+=mat[i][j];}
                
                // secondary diagonal
                else if (cnt == j) { diagonal_sum+=mat[i][j]; }
            }
            cnt--;
        }
        return diagonal_sum;
    }
}
