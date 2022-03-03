class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
       int total=0;
       // int n= nums.length();
        for(int i=0;i<nums.length-1;i++){
            int c=1;
            int diff= nums[i+1]-nums[i];
            for(int j= i+2;j<nums.length;j++){
                if(nums[j]-nums[j-1]==diff)
                    total++;
                else break;
                
            }
        }
        return total;
    }
}
