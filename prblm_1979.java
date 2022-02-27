class prblm_1979{
    public int findGCD(int[] nums) {
         Arrays.sort(nums);
        int sm=nums[0],hs=nums[nums.length-1];
        return gcd(sm,hs);
    }
    public int gcd(int a,int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
        
    }
}
