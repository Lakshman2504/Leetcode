class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        recursion(0,nums,new ArrayList<Integer>(),res);
        return res;
    }
    public static void recursion(int index,int[] arr,List<Integer> temp,List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
        for(int i = index;i<arr.length;i++){
            temp.add(arr[i]);
            recursion(i + 1,arr,temp,res);
            temp.remove(temp.size() - 1);
        }
    }
}