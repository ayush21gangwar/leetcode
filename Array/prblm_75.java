class prblm_75 {
    public void sortColors(int[] nums) {
           
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                a++;
            else if(nums[i]==1)
                b++;
            else
                c++;
            
        }
        for(int i=0;i<nums.length;i++){
            if(i<a)
                nums[i] = 0;
            else if(i<a+b)
                nums[i] = 1;
            else
                nums[i] = 2;
        
    }
}
}
