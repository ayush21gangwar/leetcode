class prblm_1486 {
    public int xorOperation(int n, int start) {
          int [] array = new int [n];
        int sum=0;
        for(int i=0;i<array.length;i++){
            array[i]=start+2*i;
            sum ^=array[i];
        }
        
        return sum;
        
    }
}