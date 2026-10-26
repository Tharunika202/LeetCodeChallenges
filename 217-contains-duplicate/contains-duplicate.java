class Solution {
    public boolean containsDuplicate(int[] nums) {
        // int[] res= Arrays
        //         .stream(nums)
        //         .distinct()
        //         .toArray();
        // return !Arrays.equals(nums, res);
        HashMap<Integer, Integer> hashMap= new HashMap<>();
        for(int i = 0; i < nums.length; i++){
         if(hashMap.getOrDefault(nums[i],0)>0){
           return true;
         }
           hashMap.put(nums[i], 1);
      }
     
      return false;

    }
}