class Solution {
    public boolean containsDuplicate(int[] nums) {
        int[] res= Arrays
                .stream(nums)
                .distinct()
                .toArray();
        return !Arrays.equals(nums, res);
    }
}