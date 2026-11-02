class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashMap = new HashMap<>();


    for(int i=0;i< strs.length;i++) {
      char[] c = strs[i].toCharArray();
      Arrays.sort(c);
      String s = new String(c);
      if(hashMap.containsKey(s)){
        hashMap.get(s).add(strs[i]);
      }
      else {
        List<String> list = new ArrayList<>();
        list.add(strs[i]);
        hashMap.put(s, list);
      }
    }
    return new ArrayList<>(hashMap.values());
    }
}