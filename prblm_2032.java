class prblm_2031 {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
         int k [] = new int [300];
        for(int i = 0; i < nums1.length;i++){
            k[nums1[i]-1]++;
        }
        for(int j = 0; j < nums2.length;j++){
            k[nums2[j]+99]++;
        }
        for(int l = 0; l < nums3.length;l++){
            k[nums3[l]+199]++;
        }
        List <Integer> list = new ArrayList<>();
        for(int i = 0; i < 100; i ++){
            if((k[i]!=0 && k[i+100]!=0)||(k[i]!=0 && k[i+200]!=0)||(k[i+100]!=0 && k[i+200]!=0)){
                list.add(i+1);
            }
        }
        return list;
        
    }
}