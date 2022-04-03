class prblm_1732 {
    public int largestAltitude(int[] gain) {
        int res = 0;
        int max = 0;
        for(int i=0;i<gain.length;i++){
        res = res+gain[i];
        if(max < res){
        max = res;
   }
       }
          return max;
    }
}
