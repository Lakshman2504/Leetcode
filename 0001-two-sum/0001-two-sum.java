class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i= 0;i<nums.length;i++){
            int a = target - nums[i];
            if(hs.containsKey(a)){
                return new int[]{hs.get(a),i};
            }
            hs.put(nums[i],i);
        }
        return new int[]{};
    }
}