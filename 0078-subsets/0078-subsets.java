class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        recursion(0,nums,new ArrayList<Integer>(),res);
        return res;
    }
    public static void recursion(int index,int[] arr,List<Integer> temp,List<List<Integer>> res){
        if(index == arr.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[index]);
        recursion(index + 1,arr,temp,res);

        temp.remove(temp.size() - 1);
        recursion(index + 1,arr,temp,res);
    }
}