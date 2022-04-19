class prblm_1299 {
    public int[] replaceElements(int[] arr) {
        int nums[]= new int [arr.length];
        for(int i=0;i<arr.length-1;i++){
            int max=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            nums[i]=max;
        }
        nums[arr.length-1]=-1;
        return nums;
    }
}

