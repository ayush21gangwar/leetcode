class prblm_2053 {
    public String kthDistinct(String[] arr, int k) {
        int n=arr.length;
       for(int i=0;i<n;i++)
       {
         int cnt=0;
         for(int j=0;j<n;j++)
           if(arr[i].equals(arr[j]))
             cnt++; 
          
         if(cnt==1)
           k--; 
               
         if(k==0)
           return arr[i];    
       }
       return "";  
    }
}