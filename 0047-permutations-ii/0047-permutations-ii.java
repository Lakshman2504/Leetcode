class Solution {
    public void permute(int index,int[] arr,List<List<Integer>> res,boolean[] used,List<Integer> temp){
        if(index == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<arr.length;i++){
            if(i > 0 && arr[i] == arr[i - 1] && !used[i - 1]) continue;
            if(!used[i]){
                used[i] = true;
                temp.add(arr[i]);
                permute(index + 1,arr,res,used,temp);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        permute(0,nums,res,used,new ArrayList<>());
        return res;
    }
}