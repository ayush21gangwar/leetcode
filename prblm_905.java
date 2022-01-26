class prblm_905 {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length ==1 || nums.length ==0) return nums;
    int i=0,j=nums.length-1;
    while(i<j){
        while(i<nums.length && nums[i]%2 == 0){   i++;     }
        while(j>0 &&nums[j]%2==1){  j--;  }
        if(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
         }			 
    }       
    return nums;
        
    }
}
