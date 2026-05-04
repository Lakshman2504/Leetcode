class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count = 0;
        int idx= -1;
        int product = 1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                count++;
                idx = i;
            }else{
                product *= nums[i];
            }
        }
        int[] arr = new int[nums.length];
        if(count == 1){
            arr[idx] = product;
        }else if(count == 0){
            for(int i = 0;i<nums.length;i++){
                arr[i] = product / nums[i];
            }
        }else{
            return arr;
        }return arr;
    }
    
}