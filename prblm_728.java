class prblm_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>();
        boolean add;
        int n,d;
        for(int i=left;i<=right;i++) {
            n = i;
            add = true;
            while(n > 0) {
                d = n%10;
                if(d == 0 || i % d != 0){
                    add = false;
                    break;
                }
                n/=10;
            }
            if(add) ans.add(i);
        }
        return ans;
    }
}
