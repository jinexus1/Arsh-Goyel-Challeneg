class Solution {
  public boolean exist(char[][] board, String word) {
    int m = board.length; // row
    int n = board[0].length; // column
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (board[i][j] == word.charAt(0) && findPath(board, i, j, 0, word)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean findPath(char[][] board, int i, int j, int index, String word) {
    List<int[]> direction = Arrays.asList(new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } });
    if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '$') {
      return false;
    }
    if (board[i][j] != word.charAt(index)) {
      return false;
    }
    char temp = board[i][j];
    board[i][j] = '$';
    if (index == word.length() - 1) {
      return true;
    }
    for (int[] dir : direction) {
      int i_new = i + dir[0];
      int j_new = j + dir[1];
      if (findPath(board, i_new, j_new, index + 1, word)) {
        return true;
      }
    }
    board[i][j] = temp;
    return false;
  }
}