class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int top = 0;
    int down = matrix.length - 1;
    int left = 0;
    int right = matrix[0].length - 1;
    int dir = 0;
    /*
     * dir=0: left to right
     * dir=1: top to down
     * dir=2: right to left
     * dir=3: down to top
     */
    List<Integer> result = new ArrayList<>();
    if (matrix == null || matrix.length == 0) {
      return result;
    }
    while (top <= down && left <= right) {
      if (dir == 0) {
        // left to right
        // Constant top
        for (int i = left; i <= right; i++) {
          result.add(matrix[top][i]);
        }
        top++;
      } else if (dir == 1) {
        // top to down
        // constant right
        for (int i = top; i <= down; i++) {
          result.add(matrix[i][right]);
        }
        right--;
      } else if (dir == 2) {
        // right to left
        // constant down
        for (int i = right; i >= left; i--) {
          result.add(matrix[down][i]);
        }
        down--;
      } else if (dir == 3) {
        // down to top
        // constant left
        for (int i = down; i >= top; i--) {
          result.add(matrix[i][left]);
        }
        left++;
      }
      dir++;
      if (dir == 4)
        dir = 0;
    }
    return result;
  }
}