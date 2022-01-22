class prblm_1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
    int i = 0;
    int j = n;
    int k = 0;
    while(k<nums.length){
        res[k] = nums[i];
        i++;
        k++;
        res[k] = nums[j];
        j++;
        k++;
    }
    return res;
        
    }
}
