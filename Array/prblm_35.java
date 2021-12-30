 class prblm_35 {
    public int searchInsert(int[] nums, int target) {
for(int i = 0; i < nums.length; i++){
if(nums[i] >= target) return i;
}
// the target should be inserted at the end of the array
return nums.length;
}
}
        
        
    

