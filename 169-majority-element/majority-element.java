class Solution {
    public int majorityElement(int[] nums) {
        int d = nums.length/2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int val : nums) {
            if (hashMap.containsKey(val)) {
                hashMap.put(val, hashMap.get(val) + 1);

            } else {
                hashMap.put(val, 1);
            }

        }
        for (Integer i: hashMap.keySet()){
            if(hashMap.get(i)>d){
                return i;
            }
        }
        return 0;
    }
}