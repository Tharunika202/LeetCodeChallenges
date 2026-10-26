class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int[] res= Arrays
        //         .stream(nums)
        //         .distinct()
        //         .toArray();
        // return !Arrays.equals(nums, res);
         Arrays.sort(nums);
      for (int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
          return true;
        }
      }
      return false;
    }
}