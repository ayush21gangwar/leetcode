class Solution {
    public int countLargestGroup(int n) {
        int[] ans = new int[37];
        int max = 0;
        
        for(int i = 1; i <= n; i++) {
            int sum = 0;
            int k = i;
            while(k != 0) {
                sum += k%10;
                k /= 10;
            }
            ans[sum]++;
            max = Math.max(max, ans[sum]);
        }
        
        int count = 0;
        for(int x : ans) {
            if(x==max) count++;
        }
        
        return count;
    }
}