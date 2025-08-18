class Solution {
    public void recursion(int index,int[] arr,int k,List<List<Integer>> res,List<Integer> temp){
        if(temp.size() == k){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index;i<arr.length;i++){
            temp.add(arr[i]);
            recursion(i + 1,arr,k,res,temp);
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) arr[i] = i + 1;
        recursion(0,arr,k,res,new ArrayList<>());
        return res;
    }
}