class prblm_27 {
    public int removeElement(int[] nums, int val) {
        int n = nums.length, c = 0;
for(int i=0;i<nums.length;i++){
if(nums[i] == val){
nums[i] = 60;
c++;
}
}
int k = n-c;
Arrays.sort(nums);
return k;
}
        
    }

