class Solution {
    public int removeDuplicates(int[] nums) {

        long count = Arrays.stream(nums).distinct().count();

        int j =0;
        for(int i =1; i<nums.length;i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];  
            }
        }

        return (int) count;
        
    }
}