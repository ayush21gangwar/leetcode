class prblm_263 {
    public boolean isUgly(int n) {
         if(n==0){ 
             return false;}
        if(n==1||n==2||n==3||n==5) {
            return true;
        }
        if(n%2==0){
            return isUgly(n/2);
        }
        if(n%3==0){
            
        return isUgly(n/3);
        }
        
        if(n%5==0){
            
         return isUgly(n/5); 
        }
        else return false;
        
    }
}