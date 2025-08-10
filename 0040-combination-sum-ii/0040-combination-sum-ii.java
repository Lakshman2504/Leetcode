class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        findComb(0,candidates,target,res,new ArrayList<>());
        return res;
    }
    public void findComb(int index,int[] arr,int target,List<List<Integer>> res,List<Integer> temp){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index;i<arr.length;i++){
            if(i > index && arr[i] == arr[i - 1]) continue;
            if(target < arr[i]) return;
            temp.add(arr[i]);
            findComb(i + 1,arr,target - arr[i],res,temp);
            temp.remove(temp.size() - 1);
        }
    }
}