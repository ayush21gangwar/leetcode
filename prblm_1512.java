class prblm_1512 {
    public int numIdenticalPairs(int[] nums) {
        int output = 0;
for (int i = 0; i < nums.length; i++) {
for (int j = i+1; j < nums.length ; j++) {
if(nums[i] == nums[j]){
output += 1;
}
}
}
return output;
        
    }
}
