class prblm_1374 {
    public String generateTheString(int n) {
        String str="";
        if (n%2==0){
            for (int i=0;i<n-1;i++)
                str+="a";
            str+="b";
            return str;
        }
        else
        {
            str=str+"a";
            for (int i=1;i<n-1;i++)
                str=str+"b";
            if (n!=1)
            str=str+"c";
            return str;
    }
}
}