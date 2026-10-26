class Solution {
    public int[] topKFrequent(int[] nums, int k) {


        HashMap<Integer, Integer> hashMap =  new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hashMap.merge(nums[i], 1, Integer::sum);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed() );
      System.out.println(list);
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
          arr[i] = list.get(i).getKey();
        }
        return arr;
        
    }
}