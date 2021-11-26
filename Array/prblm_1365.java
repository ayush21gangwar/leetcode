class prblm_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];  // result array banao nums ke length jitnnaa  to store counts
    int count=0;                       // initial count 0 hai
    
    for(int i=0; i<nums.length; i++){  // keep i on start of array
        for(int j=0; j<nums.length; j++){  // aslo keep j at start
            if(nums[i]>nums[j] && i!=j){   // compare i j if i greater hai means count ++ kaarna paadega
                count++; 
            }
        }
        res[i] = count;  // humare res array mai final count store kaaro
        count = 0;   // first num ka hua toh count zero karo 
    }
    return res;
}
        
    }

