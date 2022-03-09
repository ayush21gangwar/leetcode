class prblm_1338 {
    public int minSetSize(int[] arr) {
        Arrays.sort(arr);
    int n = arr.length;
    int count = 1;
    ArrayList<Integer> al = new ArrayList<>();
     for(int i=0; i<arr.length-1; i++){
        if(arr[i] != arr[i+1]){
            al.add(count);
            count=1;
        }
         else{
             count++;
         }
     }
     al.add(count);
    
    Collections.sort(al);

    int a=0,ans=0;
    for(int i=al.size()-1; i>=0; i--){
         a += al.remove(i);
            ans++; 
         if(arr.length-a <= n/2){
                 break;
         }     
    }
    return ans;
    
        
    }
}
