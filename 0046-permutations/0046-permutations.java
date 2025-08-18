class Solution {
    public void recursion(int index,int[] arr,List<List<Integer>> res,List<Integer> temp,boolean[] used){
        if(index == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<arr.length;i++){
            if(!used[i]){
                used[i] = true;
                temp.add(arr[i]);
                recursion(index + 1,arr,res,temp,used);
                temp.remove(temp.size() - 1);
                used[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        recursion(0,nums,res,new ArrayList<>(),used);
        return res;
    }
}