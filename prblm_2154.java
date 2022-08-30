class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean present = true;
        while(present){
            present = false;
            for(int i=0; i<nums.length; i++){
                if(nums[i] == original){
                    present = true;
                    original *= 2;
                    break;
                }
            }
        }
        return original;
    }
}