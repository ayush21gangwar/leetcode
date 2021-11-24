import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        Scanner src= new Scanner(System.in);
        //int x= src.nextInt();
        int temp;
        int sum=0;
        int r;
        temp=x;    
  while(x>0){    
   r=x%10;    
   sum=(sum*10)+r;    
   x=x/10;    
  }    
  if(temp==sum) {   
   return true;  
  }
  else{    
   return false;    
}  
}  
          }
