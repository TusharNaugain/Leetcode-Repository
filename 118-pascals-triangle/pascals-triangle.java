import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Return an empty list if no rows are required
        if (numRows == 0) return result;
        
        // Add the first row, which is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        // Generate the subsequent rows
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            
            // First element of the row is always 1
            row.add(1);
            
            // Generate the elements in between
            for (int j = 0; j < i - 1; j++) {
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }
            
            // Last element of the row is always 1
            row.add(1);
            
            // Add this new row to the final result
            result.add(row);
        }
        
        return result;
    }
}
