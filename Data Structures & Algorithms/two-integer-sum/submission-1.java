class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> index = new HashMap<>();
        if(n <2 || n >1000) return new int[] {}; 
        
        for(int i = 0; i< n ; i++){
            int complementary = target - nums[i];
            if(index.containsKey(complementary)) {
                return new int[] {index.get(complementary) , i };
            }

            index.put(nums[i], i);
        }
        return new int[] {};
    }
}
