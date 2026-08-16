//import java.util.ArrayList;
// import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return ans;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int totalElements = rows * cols;

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        // Traverse layer by layer until we collect all elements
        while (ans.size() < totalElements) {
            
            // 1. Traverse Right (across the top boundary)
            for (int i = left; i <= right && ans.size() < totalElements; i++) {
                ans.add(matrix[top][i]);
            }
            top++; // Shrink top boundary row-wise

            // 2. Traverse Down (along the right boundary)
            for (int i = top; i <= bottom && ans.size() < totalElements; i++) {
                ans.add(matrix[i][right]);
            }
            right--; // Shrink right boundary column-wise

            // 3. Traverse Left (across the bottom boundary)
            for (int i = right; i >= left && ans.size() < totalElements; i--) {
                ans.add(matrix[bottom][i]);
            }
            bottom--; // Shrink bottom boundary row-wise

            // 4. Traverse Up (along the left boundary)
            for (int i = bottom; i >= top && ans.size() < totalElements; i--) {
                ans.add(matrix[i][left]);
            }
            left++; // Shrink left boundary column-wise
        }

        return ans;
    }
}
