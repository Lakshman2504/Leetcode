class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length - 1);
        return nums;
    }
    public void mergesort(int[] nums,int low,int high){
        if(low >= high){
            return;
        }
        if(low < high){
            int mid = low + (high - low)/2;
            mergesort(nums,low,mid);
            mergesort(nums,mid + 1,high);
            merge(nums,low,mid,high);
        }
    }
    public void merge(int[] nums,int low,int mid,int high){
        int left = low;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while(right <= high && left <= mid){
            if(nums[left] <= nums[right]){
                temp.add(nums[left++]);
            }else{
                temp.add(nums[right++]);
            }
        }
        while(left <= mid){
            temp.add(nums[left++]);
        }
        while(right <= high){
            temp.add(nums[right++]);
        }
        for(int i = low;i <= high;i++){
            nums[i] = temp.get(i - low);
        }
    }
}