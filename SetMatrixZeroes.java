class Solution {
  public void setZeroes(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    boolean[][] isOriginalZero = new boolean[rows][cols];

    // First pass: record the position of original zeros in the matrix and mark them
    // true
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (matrix[i][j] == 0) {
          isOriginalZero[i][j] = true;
        }
      }
    }

    // Second pass: set the corresponding rows and columns to zero
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (isOriginalZero[i][j]) {
          // Set the entire row to zero
          for (int c = 0; c < cols; c++) {
            matrix[i][c] = 0;
          }
          // Set the entire column to zero
          for (int r = 0; r < rows; r++) {
            matrix[r][j] = 0;
          }
        }
      }
    }
  }
}