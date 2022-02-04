class prblm_1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i = 0 ; i< nums.length; i++){
                int difference = i - index[i];
                if(difference > 0){
                        int j = i - 1 ; 
                        while(difference > 0){
                                target[j + 1] = target[j];
                                difference--;
                                j--;
                        }
                }
                target[index[i]] = nums[i];
        }
        return target;
        
    }
}
