class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left =0;
        int right = nums.length-1;
        int pos = nums.length-1;
        while(left<=right){
            int sq1 = nums[left] * nums[left];
            int sq2 = nums[right] * nums[right];

            if (sq1>sq2) {
                res[pos] = sq1;
                left++;
            }
            else{
                res[pos]=sq2;
                right--;
            }
                pos--;  
        }
       return res;
}
}