class Solution {
  String removeDuplicates(String str) {
    StringBuilder sb = new StringBuilder();
    HashSet<Character> set = new HashSet<Character>();
    int size = 0;
    for (int i = 0; i < str.length(); i++) {
      set.add(str.charAt(i));
      if (set.size() != size) {
        sb.append(str.charAt(i));
        size++;
      }
    }
    return sb.toString();
  }
}