class prblm_961 {
    public int repeatedNTimes(int[] nums) {
        int output = 0;
	int n = nums.length/2;
	for(int i = 0;i<nums.length;i++) {
		int tempCount = 0;
		for(int j = i+1;j<nums.length;j++) {
			if(nums[i]==nums[j])
				tempCount++;
		}
		if(n==tempCount+1) {
			output = nums[i];
			break;
		}
	}
	return output;
        
    }
}
