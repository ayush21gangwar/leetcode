class prblm_1464 {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int result=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        return result;
        
        
    }
}