class Solution {
    public void subset(int index,int[] arr,List<Integer> temp,List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
        for(int i = index;i<arr.length;i++){
            if(i > index && arr[i] == arr[i - 1]) continue;

            temp.add(arr[i]);
            subset(i + 1,arr,temp,res);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        subset(0,nums,new ArrayList<Integer>(),res);
        return res;
    }
}