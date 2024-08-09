import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;
        
        int rowBeg = 0, rowEnd = matrix.length - 1;
        int colBeg = 0, colEnd = matrix[0].length - 1;

        while (rowBeg <= rowEnd && colBeg <= colEnd) {
            //Transverse Right
            for (int i = colBeg; i <= colEnd; i++) {
                res.add(matrix[rowBeg][i]);
            }
            rowBeg++; 
            
            // Traverse down
            for (int i = rowBeg; i <= rowEnd; i++) {
                res.add(matrix[i][colEnd]);
            }
            colEnd--; // Move left the ending column
            
            if (rowBeg <= rowEnd) {
                // Traverse left
                for (int i = colEnd; i >= colBeg; i--) {
                    res.add(matrix[rowEnd][i]);
                }
                rowEnd--; // Move up the ending row
            }
            
            if (colBeg <= colEnd) {
                // Traverse up
                for (int i = rowEnd; i >= rowBeg; i--) {
                    res.add(matrix[i][colBeg]);
                }
                colBeg++; // Move right the starting column
            }
        }
        
        return res;
    }
}
