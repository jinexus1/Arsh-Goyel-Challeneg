class Solution {
  public int strStr(String haystack, String needle) {
    int hy = haystack.length();
    int ne = needle.length();
    if (hy < ne) {
      return -1;
    }
    for (int i = 0; i <= hy - ne; i++) {
      int j = 0;
      while (j < needle.length() && haystack.charAt(i + j) == needle.charAt(j))
        j++;
      if (j == ne)
        return i;
    }
    return -1;
  }
}