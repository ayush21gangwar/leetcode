class prblm_189 {
    public void rotate(int[] nums, int k) 
    {
        k=k%nums.length;
        reverse(0,nums.length-1,nums);
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);
    }
    private void reverse(int start,int end,int nums[])
    {
        while(start<end)
          {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
          }
    }
}  
