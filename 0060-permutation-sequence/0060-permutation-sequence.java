class Solution {
    public String permute(int[] fact,List<Integer> res,int k){
        if(res.isEmpty()){
            return "";
        }
        int n = res.size();
        int idx = k / fact[n - 1];
        int newK = k % fact[n - 1];

        int chosen = res.remove(idx);
        return chosen + permute(fact,res,newK);
    }
    public String getPermutation(int n, int k) {
        List<Integer> res = new ArrayList<>();
        for(int i = 1;i<=n;i++){
            res.add(i);
        }
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for(int i = 1;i<n;i++){
            fact[i] = fact[i - 1] * i;
        }
        return permute(fact,res,k - 1);
    }
}