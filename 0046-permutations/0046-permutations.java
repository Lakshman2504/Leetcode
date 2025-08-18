class Solution {
    public void recursion(int index,int[] arr,List<List<Integer>> res){
        if(index == arr.length){
            List<Integer> temp = new ArrayList<>();
            for(int i = 0;i<arr.length;i++){
                temp.add(arr[i]);
            }
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = index;i<arr.length;i++){
            swap(arr,i,index);
            recursion(index + 1,arr,res);
            swap(arr,i,index);
        }
    }
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        recursion(0,nums,res);
        return res;
    }
}