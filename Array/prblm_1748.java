class prblm_1748 {
    public int sumOfUnique(int[] nums) {
        int a[]=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            a[nums[i]]++;
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
                sum=sum+i;
        }
        return sum;
        
    }
}