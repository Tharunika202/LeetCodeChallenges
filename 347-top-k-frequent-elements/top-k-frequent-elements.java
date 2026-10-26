class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int offSet = 10000;
        int[] count = new int[20001];
        for (int num : nums) {
            count[num + offSet]++;
        }

        // Step 2: buckets, where index = frequency
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                buckets.get(count[i]).add(i - offSet);
            }
        }

        // Step 3: collect from the highest frequency down
        int[] result = new int[k];
        int idx = 0;
        for (int freq = nums.length; freq >= 1; freq--) {
            for (int number : buckets.get(freq)) {
                result[idx++] = number;
                if (idx == k) {
                    return result;
                }
            }
        }
        return result;
    }
}