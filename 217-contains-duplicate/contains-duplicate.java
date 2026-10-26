class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int[] res= Arrays
        //         .stream(nums)
        //         .distinct()
        //         .toArray();
        // return !Arrays.equals(nums, res);

        HashMap<Integer, Integer> hashMap= new HashMap<>();
      for(int i = 0; i < nums.length; i++){
        if(hashMap.containsKey(nums[i])){
          return true;
        }
        else {
          hashMap.put(nums[i], 1);
        }
      }
      return false;
      }
}