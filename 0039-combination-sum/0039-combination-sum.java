class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        findComb(0,candidates,target,res,new ArrayList<>());
        return res;
    }
    public void findComb(int index,int[] arr,int target,List<List<Integer>> res,List<Integer> temp){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if( index >= arr.length || target < 0) return;
        temp.add(arr[index]);
        findComb(index,arr,target - arr[index],res,temp);
        temp.remove(temp.size() - 1);
        findComb(index + 1,arr,target,res,temp);
    }
}