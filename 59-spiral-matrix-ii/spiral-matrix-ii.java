class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowBeg = 0, rowEnd = n - 1;
        int colBeg = 0, colEnd = n - 1;
        int num = 1;

        while (rowBeg <= rowEnd && colBeg <= colEnd) {
            // Fill the top row
            for (int i = colBeg; i <= colEnd; i++) {
                matrix[rowBeg][i] = num++;
            }
            rowBeg++;

            // Fill the right column
            for (int i = rowBeg; i <= rowEnd; i++) {
                matrix[i][colEnd] = num++;
            }
            colEnd--;

            // Fill the bottom row
            if (rowBeg <= rowEnd) {
                for (int i = colEnd; i >= colBeg; i--) {
                    matrix[rowEnd][i] = num++;
                }
                rowEnd--;
            }

            // Fill the left column
            if (colBeg <= colEnd) {
                for (int i = rowEnd; i >= rowBeg; i--) {
                    matrix[i][colBeg] = num++;
                }
                colBeg++;
            }
        }

        return matrix;
    }
}
