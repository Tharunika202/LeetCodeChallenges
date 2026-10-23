class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i: nums) {
            hashMap.merge(i, 1, Integer::sum);
            if (hashMap.get(i)>nums.length/2){
                return i;
            }
        }
        return 0;
    }
}