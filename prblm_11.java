class prblm_11 {
    public int maxArea(int[] height) {
//          int max = Integer.MIN_VALUE;
//         int j;
//         for(int i= 0;i<height.length-1;++i){     ///time limit exceed ho ja rahi hai do loop ki wajha se
//             for( j=i+1;j<height.length;++j){
//                  max = Math.max(max, (j - i) * Math.min(height[i], height[j]));
                
//             }
            
//         }
//         return max;
        int i=0,j= height.length-1,maxArea=0;
        while(i<j){
              maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
          
            
        }
          return maxArea;
        
    }
}