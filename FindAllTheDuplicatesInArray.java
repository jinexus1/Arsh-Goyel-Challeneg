class Solution {
  public List<Integer> findDuplicates(int[] nums) {
    // Make a hashtable to maintain the count of each element
    // if the elemet count is greater than 1 then
    // convert the hash map data into List and return it
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int num : nums) {
      // if(!mp.containsKey(num)){
      // mp.put(num,mp.getOrDefault(num,0)+1);
      // }
      // mp
      mp.put(num, mp.getOrDefault(num, 0) + 1);
    }
    List<Integer> ans = new LinkedList<>();
    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
      if (entry.getValue() > 1) {
        ans.add(entry.getKey());
      }
    }
    return ans;
  }
}
// Map.Entry is an interface in Java that represents a key-value pair in a Map.
// It provides methods to access the key and value of the entry.
// When you use entrySet() on a Map,
// it returns a **Set of Map.Entry objects**, allowing you to iterate over the
// map's entries.