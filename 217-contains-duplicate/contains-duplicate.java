class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int[] res= Arrays
        //         .stream(nums)
        //         .distinct()
        //         .toArray();
        // return !Arrays.equals(nums, res);

        HashMap<Integer, Integer> hashMap= new HashMap<>();
      for(int i = 0; i < nums.length; i++){
        hashMap.merge(nums[i], 1, Integer::sum);
      }
      for(Integer i : hashMap.values()){
        if(i>1){
          return true;
        }
      }
      return false;
    }
}