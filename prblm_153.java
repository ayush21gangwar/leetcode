class prblm_153 {
    public int findMin(int[] nums) {
         int l=0,r=nums.length-1;
        
       int mid=0;
        
        while(l<r){
            
            //array is sorted
            if(nums[l]<nums[r]){ 
                
                return nums[l];
            }
            
           mid=(r+l)/2;
        
          if(nums[mid]<nums[l]){
              r=mid;
          }
            
          else{
              
              l=mid+1;
          }
        }
        
        return nums[r];
    }
}