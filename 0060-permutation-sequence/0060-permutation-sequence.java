class Solution {
    int count = 0;
    String ans = "";
    public void permute(int n,int k,StringBuilder temp,boolean[] used){
        if(temp.length() == n){
            count++;
            if(count == k){
                ans = temp.toString();
            }
            return;
        }
        for(int i = 1;i<=n;i++){
            if(!used[i]){
                used[i] = true;
                temp.append(i);
                permute(n,k,temp,used);
                temp.deleteCharAt(temp.length() - 1);
                used[i] = false;
            }
        }
    }
    public String getPermutation(int n, int k) {
        StringBuilder temp = new StringBuilder();
        boolean[] used = new boolean[n + 1];
        permute(n,k,temp,used);
        return ans;
    }
}