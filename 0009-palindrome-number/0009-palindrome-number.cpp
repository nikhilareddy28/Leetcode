class Solution {
public:
    bool isPalindrome(int x) {
        long rev=0,r;
        long  t=x;
        while(x>0){
         r=x%10;
         rev=rev*10+r;
         x=x/10;
        }
        if(rev==t) return true;
         else return false;
        
    }
};